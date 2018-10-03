package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ConsultaExamen")
public class ConsultaExamen {
	
	@Id
	private Integer idExamen;
	
	@Column(name="nombre", nullable= false, length= 70)
	private String nombre;
	
	@Column(name="descripcion", nullable= false, length= 70)
	private String descripcion; 
	
	public ConsultaExamen() {
		
	}
	
	public ConsultaExamen(Integer idExamen, String nombre, String descripcion) {
		super();
		this.idExamen = idExamen;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Integer idExamen) {
		this.idExamen = idExamen;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
		
	
}
