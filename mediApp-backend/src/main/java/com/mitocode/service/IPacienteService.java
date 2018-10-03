package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Paciente;

public interface IPacienteService {
	
	Paciente registrar (Paciente pac);
	void modificar (Paciente pac);
	void eliminar (Integer cod);
	List<Paciente> listar();
	Paciente listar(Integer cod);
	
}
