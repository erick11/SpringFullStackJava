package com.mitocode.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mitocode.dao.IEspecialidadDao;
import com.mitocode.model.Especialidad;
import com.mitocode.service.IEspecialidadService;

/**
@Service = serive para indicar los servicos para la anotacion @Autowired	
*/
@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	private IEspecialidadDao dao;

	/**
	@Autowired: anotacion obligatoria
	 * */
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
