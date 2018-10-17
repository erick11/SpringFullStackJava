package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Examen;

public interface IExamenService {
	
	Examen registrar (Examen exam); 
	void modificar (Examen exam);
	void eliminar (Integer cod);
	
	List<Examen> listar();
	Examen listar(Integer cod);

}
