package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tb_Medico")
public class Medico {

	@Id
	private Integer idMedico;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="cmp")
	private String cmp;
	
	public Medico() {
	
	}
		
	public Medico(Integer idMedico, String nombres, String apellidos, String cmp) {
		super();
		this.idMedico = idMedico;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cmp = cmp;
	}

	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	
	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", nombres=" + nombres + ", apellidos=" + apellidos + ", cmp=" + cmp
				+ "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((cmp == null) ? 0 : cmp.hashCode());
		result = prime * result + ((idMedico == null) ? 0 : idMedico.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
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
		Medico other = (Medico) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (cmp == null) {
			if (other.cmp != null)
				return false;
		} else if (!cmp.equals(other.cmp))
			return false;
		if (idMedico == null) {
			if (other.idMedico != null)
				return false;
		} else if (!idMedico.equals(other.idMedico))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		return true;
	}
	
	
	
	
	
	
}
