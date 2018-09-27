package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_Especialidad")
public class Especialidad {

	@Id
	private Integer idConsulta;
	
	@Column(name="")
	private String nombre;
	
	
	public Especialidad() {
		
	}

	public Especialidad(Integer idConsulta, String nombre) {
		super();
		this.idConsulta = idConsulta;
		this.nombre = nombre;
	}

	
	
	
}
