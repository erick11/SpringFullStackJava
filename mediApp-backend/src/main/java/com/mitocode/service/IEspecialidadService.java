package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Especialidad;

public interface IEspecialidadService {

	void registrar(Especialidad especialidad);
	void modificar(Especialidad especialidad);
	void eliminar(Especialidad especialidad);
	
	List<Especialidad> listar();
	Especialidad listar(Integer codigo);	

}
