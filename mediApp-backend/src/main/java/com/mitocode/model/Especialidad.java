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

	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEspecialidad == null) ? 0 : idEspecialidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidad other = (Especialidad) obj;
		if (idEspecialidad == null) {
			if (other.idEspecialidad != null)
				return false;
		} else if (!idEspecialidad.equals(other.idEspecialidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
