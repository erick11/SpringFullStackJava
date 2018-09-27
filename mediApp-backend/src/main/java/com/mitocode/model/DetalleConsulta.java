package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_Consulta")
public class DetalleConsulta {
	
	@Id
	private Integer idConsulta;
	
	@Column(name="idDetalle")
	private Integer idDetalle;
	
	@Column(name="diagnostico")
	private String diagnostico;
	
	@Column(name="tratamiento")
	private String tratamiento;
	
	public DetalleConsulta() {
		
	}

	public DetalleConsulta(Integer idConsulta, Integer idDetalle, String diagnostico, String tratamiento) {
		super();
		this.idConsulta = idConsulta;
		this.idDetalle = idDetalle;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public String toString() {
		return "DetalleConsulta [idConsulta=" + idConsulta + ", idDetalle=" + idDetalle + ", diagnostico=" + diagnostico
				+ ", tratamiento=" + tratamiento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diagnostico == null) ? 0 : diagnostico.hashCode());
		result = prime * result + ((idConsulta == null) ? 0 : idConsulta.hashCode());
		result = prime * result + ((idDetalle == null) ? 0 : idDetalle.hashCode());
		result = prime * result + ((tratamiento == null) ? 0 : tratamiento.hashCode());
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
		DetalleConsulta other = (DetalleConsulta) obj;
		if (diagnostico == null) {
			if (other.diagnostico != null)
				return false;
		} else if (!diagnostico.equals(other.diagnostico))
			return false;
		if (idConsulta == null) {
			if (other.idConsulta != null)
				return false;
		} else if (!idConsulta.equals(other.idConsulta))
			return false;
		if (idDetalle == null) {
			if (other.idDetalle != null)
				return false;
		} else if (!idDetalle.equals(other.idDetalle))
			return false;
		if (tratamiento == null) {
			if (other.tratamiento != null)
				return false;
		} else if (!tratamiento.equals(other.tratamiento))
			return false;
		return true;
	}
	
	
	
	
}
