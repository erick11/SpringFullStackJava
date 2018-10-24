package com.bemainick.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bemainick.model.Persona;

@Repository
public interface IPersonaDao extends JpaRepository<Persona, Integer>{

	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
}
