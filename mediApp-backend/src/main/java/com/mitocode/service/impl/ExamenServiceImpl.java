package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IExamenDao;
import com.mitocode.model.Examen;
import com.mitocode.service.IExamenService;

/**
@Service = serive para indicar los servicos para la anotacion @Autowired	
*/
@Service
public class ExamenServiceImpl implements IExamenService{

	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private IExamenDao dao;
	
	@Override
	public Examen registrar(Examen exam) {
		return dao.save(exam);
	}

	@Override
	public void modificar(Examen exam) {
		dao.save(exam);
		
	}

	@Override
	public void eliminar(Integer cod) {
		dao.deleteById(cod);
		
	}

	@Override
	public List<Examen> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Examen listar(Integer cod) {
		
		return dao.findById(cod).get();
		
	}
	
}
