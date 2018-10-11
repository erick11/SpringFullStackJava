package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IConsultaDao;
import com.mitocode.dao.IEspecialidadDao;
import com.mitocode.model.Consulta;
import com.mitocode.service.IConsultaService;
import com.mitocode.service.IEspecialidadService;

@Service
public class ConsultaServiceImpl implements IConsultaService{

	@Autowired
	private IConsultaDao dao;

	@Override
	public Consulta registrar(Consulta consulta) {		
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
