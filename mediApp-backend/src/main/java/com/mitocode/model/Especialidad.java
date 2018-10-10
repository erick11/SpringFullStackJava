package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_Especialidad")
public class Especialidad {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idEspecialidad;
	
	@Column(name="nombre")
	private String nombre;
	
	public Especialidad() {
		
	}

	public Especialidad(Integer idEspecialidad, String nombre) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombre = nombre;
	}

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
