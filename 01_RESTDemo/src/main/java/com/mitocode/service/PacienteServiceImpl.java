package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPacienteDAO;
import com.mitocode.model.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteDAO pacienteDao;

	@Override
	public void registrar(Paciente pac) {
		
		System.out.println("llega?");
		pacienteDao.save(pac);
	}

	@Override
	public void modificar(Paciente pac) {
		
		pacienteDao.save(pac);
	}

	@Override
	public void eliminar(Integer id) {
		
		pacienteDao.delete(id);
	}

	@Override
	public List<Paciente> listar() {
		
		return pacienteDao.findAll();
	}

	@Override
	public Paciente listar(Integer id) {		
		
		return pacienteDao.findOne(id);
	}
	
}
