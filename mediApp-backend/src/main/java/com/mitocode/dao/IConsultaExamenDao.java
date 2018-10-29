package com.mitocode.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.model.ConsultaExamen;

@Repository
public interface IConsultaExamenDao extends JpaRepository<ConsultaExamen, Integer>{
	
	/**
	 @Param: para indicar el paramentro que se enviara. Debe tener el mismo nombre que :idConsulta
	 nativeQuery = true : es importan te declarar este atributo; ya que, indicas el uso una query nativa 
	 @Transactional = Se utilza para indicar que se debe hacer un commit; ya que, es un query nativo
	*/
	
	//@Transactional
	@Modifying
	@Query(value = "INSERT INTO tb_consulta_examen(id_consulta, id_examen) VALUES (:idConsulta, :idExamen)", nativeQuery = true)
	int registrar(@Param("idConsulta")Integer idConsulta, @Param("idExamen")Integer idExamen);
}
