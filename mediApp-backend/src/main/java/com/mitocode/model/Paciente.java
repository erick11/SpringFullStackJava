package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idPacinete;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="email")
	private String email;
	
	public Paciente() {
		
	}

	public Paciente(Integer idPacinete, String nombres, String apellidos, String dni, String direccion, String telefono, String email) {
		this.idPacinete = idPacinete;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public Integer getIdPacinete() {
		return idPacinete;
	}
	public void setIdPacinete(Integer idPacinete) {
		this.idPacinete = idPacinete;
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

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Paciente [idPacinete=" + idPacinete + ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni="
				+ dni + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idPacinete == null) ? 0 : idPacinete.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Paciente other = (Paciente) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idPacinete == null) {
			if (other.idPacinete != null)
				return false;
		} else if (!idPacinete.equals(other.idPacinete))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
	
	
}
