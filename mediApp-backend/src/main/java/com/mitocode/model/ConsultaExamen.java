package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tb_ConsultaExamen")
public class ConsultaExamen {
	
	@Id
	private Integer idConsulta;
	@Column(name="")
	private Integer idExamen;
	
	public ConsultaExamen() {
		
	}
	
	
	public ConsultaExamen(Integer idConsulta, Integer idExamen) {
		
		this.idConsulta = idConsulta;
		this.idExamen = idExamen;
	}



	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}




	


	
}
