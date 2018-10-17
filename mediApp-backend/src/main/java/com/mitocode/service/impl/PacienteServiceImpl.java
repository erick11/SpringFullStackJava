package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPacienteDao;
import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;


/**
@Service = serive para indicar los servicos para la anotacion @Autowired	
*/
@Service
public class PacienteServiceImpl implements IPacienteService{

	
	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private IPacienteDao dao;
	
	@Override
	public Paciente registrar (Paciente pac) {
		 return dao.save(pac);		
	}

	@Override
	public void modificar(Paciente pac) {
		dao.save(pac);
		
	}

	@Override
	public void eliminar(Integer cod) {
		dao.deleteById(cod);
		
	}

	@Override
	public List<Paciente> listar() {
		
		return dao.findAll();
	}

	@Override
	public Paciente listar(Integer cod) {
		// TODO Auto-generated method stub
		return dao.findById(cod).get();
	}

}
