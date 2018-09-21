package com.mitocode.service;

import java.util.List;
import com.mitocode.model.Paciente;

public interface IPacienteService {

	void registrar (Paciente pac);
	void modificar (Paciente pac);
	void eliminar (Integer id);
	List<Paciente> listar();
	Paciente listar(Integer id);
	
	
}
