package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IEspecialidadDao;
import com.mitocode.model.Especialidad;
import com.mitocode.service.IEspecialidadService;

/**
@Service = serive para indicar los servicos para la anotacion @Autowired	
*/
@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private IEspecialidadDao dao;

	/**
	@Autowired: anotacion obligatoria
	 * */
	@Override
	public Especialidad registrar(Especialidad especialidad) {
		return  dao.save(especialidad);
		
	}

	@Override
	public void modificar(Especialidad especialidad) {
		dao.save(especialidad);		
	}

	@Override
	public void eliminar(Integer cod) {
		dao.deleteById(cod); 		
	}

	@Override
	public List<Especialidad> listar() {
		return dao.findAll();
	}

	@Override
	public Especialidad listar(Integer codigo) {

		return dao.findById(codigo).get();
		
	} 
	
	
}
