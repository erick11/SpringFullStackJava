package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Paciente;


/**
@Repository: Para indicar que es un origen de datos 
**/

@Repository
public interface IPacienteDao extends JpaRepository<Paciente, Integer>{

	/**
	 JpaRepository<Paciente, Integer>: Esta linea de codigo genera los metodos CRUD
	 * 
	 * */
	
}
