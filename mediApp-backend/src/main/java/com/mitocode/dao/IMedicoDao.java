package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Medico;

/**
@Repository: Para indicar que es un origen de datos 
**/

@Repository
public interface IMedicoDao extends JpaRepository<Medico, Integer>{

	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
}
