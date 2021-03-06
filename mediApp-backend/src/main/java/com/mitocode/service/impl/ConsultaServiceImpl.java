package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.dao.IConsultaDao;
import com.mitocode.dao.IConsultaExamenDao;
import com.mitocode.model.Consulta;
import com.mitocode.model.DetalleConsulta;
import com.mitocode.service.IConsultaService;
import com.mitocode.util.ConsultaListaExamen;


@Service
public class ConsultaServiceImpl implements IConsultaService{
	
	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private IConsultaDao dao;

	@Autowired
	private IConsultaExamenDao ceDao;
	
	@Override
	public Consulta registrar(Consulta consulta) {				
		
//		for (DetalleConsulta det : consulta.getDetalleConsultas()) {
//			det.setConsulta(consulta);
//		} 		
		
		Consulta resConsulta = new Consulta();
		
		try {
						
			consulta.getDetalleConsultas().forEach(x->{x.setConsulta(consulta);});
			resConsulta = dao.save(consulta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return resConsulta;
	}
	
	/**
	 @Transactional= Se debe implementar en la capa servicios para todo el metodo se comporte 
	 de forma transaccional; Ya que, sucede un error se haga rollback 
	 - Si desas que todos tus metodos sean transaccionales pones la anotacion a nivel de clase
	   Ejm.
	   @Transactional
	   @Service
		public class ConsultaServiceImpl implements IConsultaService{
    
	*/
	@Transactional
	@Override
	public Consulta registrarDTO(ConsultaListaExamen dto) {
		
		Consulta consulta = new Consulta();
		try {
			//Primero inserto la consulta
			dto.getConsulta().getDetalleConsultas().forEach(x->{x.setConsulta(dto.getConsulta());});
			dao.save(dto.getConsulta());
			dto.getExamenes().forEach(examen -> ceDao.registrar(dto.getConsulta().getIdConsulta(), examen.getIdExamen()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consulta;
	}

	@Override
	public void modificar(Consulta consulta) {
		dao.save(consulta);
	}

	@Override
	public void eliminar(Integer cod) {
		dao.deleteById(cod);		
	}

	@Override
	public List<Consulta> listar() {		
		return dao.findAll();
	}

	@Override
	public Consulta listar(Integer cod) {
		return dao.findById(cod).get();
	}




	
	
		
}
