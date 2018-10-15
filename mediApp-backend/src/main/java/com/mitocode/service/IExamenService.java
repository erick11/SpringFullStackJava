package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Examen;

public interface IExamenService {
	
	void registrar (Examen exam); 
	void modificar (Examen exam);
	void eliminar (Examen exam);
	
	List<Examen> listar();
	Examen listar(Integer cod);

}
