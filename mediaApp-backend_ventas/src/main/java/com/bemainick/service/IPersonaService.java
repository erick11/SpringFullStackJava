package com.bemainick.service;

import java.util.List;

import com.bemainick.model.Persona;

public interface IPersonaService {

	Persona registrar (Persona persona);
	Persona modificar (Persona persona);
	void eliminar (Integer cod);
	
	List<Persona> listar();
	Persona listar (Integer cod);
}
