package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Especialidad;

/**
 @Repository: Para indicar que es un origen de datos 
**/

@Repository
public interface IEspecialidadDao extends JpaRepository<Especialidad, Integer>{
	
	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
}
