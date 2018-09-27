package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Examen;

public interface IExamenDao extends JpaRepository<Examen, Integer>{

}
