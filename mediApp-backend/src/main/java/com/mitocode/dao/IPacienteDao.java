package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Paciente;

public interface IPacienteDao extends JpaRepository<Paciente, Integer>{

	/**
	 JpaRepository<Paciente, Integer>: Esta linea de codigo genera los metodos CRUD
	 * 
	 * */
	
}
