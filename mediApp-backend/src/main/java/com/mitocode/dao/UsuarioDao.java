package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Usuario;;


/**
@Repository: Para indicar que es un origen de datos 
**/
@Repository
public interface UsuarioDao extends  JpaRepository<Usuario, Integer>{

	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
}
