package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IExamenDao;
import com.mitocode.model.Examen;
import com.mitocode.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService{

	@Autowired
	private IExamenDao dao;
	
	@Override
	public void registrar(Examen exam) {
		dao.save(exam);
	}

	@Override
	public void modificar(Examen exam) {
		dao.save(exam);
		
	}

	@Override
	public void eliminar(Examen exam) {
		dao.delete(exam);
		
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
