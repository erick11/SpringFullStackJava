package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.dao.IMedicoDao;
import com.mitocode.model.Medico;
import com.mitocode.service.IMedicoService;


/**
@Service = serive para indicar los servicos para la anotacion @Autowired	
*/
@Service
public class MedicoServiceImpl implements IMedicoService{
	
	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private IMedicoDao dao;
	
	@Override
	public Medico registrar(Medico med) {
		System.out.println(med.toString());
		return dao.save(med);		
	}

	@Override
	public void modificar(Medico med) {
		dao.save(med);
		
	}

	@Override
	public void eliminar(Integer cod) {
		/**
		 * deleteById: Se utiliza porque es una version superior 
		*/
		dao.deleteById(cod);
		
	}
	
	@Override
	public List<Medico> listar() {
		
		return dao.findAll();
	}

	@Override
	public Medico listar(Integer cod) {

		// TODO Auto-generated method stub  
		/***
		 .get(): Indica que devolvera un solo objeto de tipo Medico
		 */

		return dao.findById(cod).get();
	}

	

	
	
}
