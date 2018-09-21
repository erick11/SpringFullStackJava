package com.mitocode.service;

import java.util.List;
import com.mitocode.model.Persona;

public interface IPersonaService {
	
	// crtl + shif + o = para importar todas las clases.
	/**
	 una interface = heredar otra interface 
	 
	 */
	 	
	void registrar (Persona per);
	void modificar (Persona per);
	void eliminar (Integer id);
	List<Persona> listar();
	Persona listar(Integer id);
}

