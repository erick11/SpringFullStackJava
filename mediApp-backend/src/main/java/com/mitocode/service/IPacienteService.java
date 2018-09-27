package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Paciente;

public interface IPacienteService {
	
	void registrar (Paciente pac);
	void actualizar (Paciente pac);
	void eliminar (Integer cod);
	List<Paciente> listar();
	Paciente listar(Integer cod);
	
}
