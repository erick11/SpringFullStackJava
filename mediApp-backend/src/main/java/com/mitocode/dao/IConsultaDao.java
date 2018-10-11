package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Consulta;


/**
@Repository: Para indicar que es un origen de datos 
**/
public interface IConsultaDao extends JpaRepository<Consulta, Integer>{

	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
	
}

