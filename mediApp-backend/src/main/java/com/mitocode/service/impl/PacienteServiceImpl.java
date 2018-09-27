package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPacienteDao;
import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteDao dao;
	
	@Override
	public void registrar(Paciente pac) {
		dao.save(pac);
		
	}

	@Override
	public void actualizar(Paciente pac) {
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
