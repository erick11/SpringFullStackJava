package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IConsultaDao;
import com.mitocode.model.Consulta;
import com.mitocode.model.DetalleConsulta;
import com.mitocode.service.IConsultaService;


@Service
public class ConsultaServiceImpl implements IConsultaService{
	
	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private IConsultaDao dao;

	@Override
	public Consulta registrar(Consulta consulta) {				
		
//		for (DetalleConsulta det : consulta.getDetalleConsultas()) {
//			det.setConsulta(consulta);
//		} 		
		
		consulta.getDetalleConsultas().forEach(x->{x.setConsulta(consulta);});
		
		
		return dao.save(consulta);
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
