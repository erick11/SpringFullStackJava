package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mitocode.model.Medico;

public interface IMedicoDao extends JpaRepository<Medico, Integer>{

	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
}
