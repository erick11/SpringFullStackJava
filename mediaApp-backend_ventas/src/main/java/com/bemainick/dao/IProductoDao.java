package com.bemainick.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bemainick.model.Producto;

@Repository
public interface IProductoDao extends JpaRepository<Producto, Integer>{

	/**
	 * JpaRepository<Medico, Integer>: agrega los metodos CRUD 
	 */
	
}
