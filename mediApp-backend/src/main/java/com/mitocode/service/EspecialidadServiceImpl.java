package com.mitocode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mitocode.dao.IEspecialidadDao;
import com.mitocode.model.Especialidad;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	private IEspecialidadDao dao;

	@Override
	public void registrar(Especialidad especialidad) {
		dao.save(especialidad);
		
	}

	@Override
	public void modificar(Especialidad especialidad) {
		dao.save(especialidad);		
	}

	@Override
	public void eliminar(Especialidad especialidad) {
		dao.delete(especialidad);		
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
