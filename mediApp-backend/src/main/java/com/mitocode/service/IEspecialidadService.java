package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Especialidad;

public interface IEspecialidadService {

	Especialidad registrar(Especialidad especialidad);
	void modificar(Especialidad especialidad);
	void eliminar(Integer cod);
	
	List<Especialidad> listar();
	Especialidad listar(Integer codigo);
	
}
