package com.bemainick.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bemainick.model.Venta;

@Repository
public interface IVentaDao extends JpaRepository<Venta, Integer>{

	
}
