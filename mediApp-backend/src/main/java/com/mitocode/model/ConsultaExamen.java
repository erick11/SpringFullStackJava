package com.mitocode.model;

import javax.persistence.Entity;

@Entity(name="tb_ConsultaExamen")
public class ConsultaExamen {

	private Integer idConsulta;
	private Integer Examen;
	
	public ConsultaExamen() {
		
	}

	public ConsultaExamen(Integer idConsulta, Integer examen) {
		super();
		this.idConsulta = idConsulta;
		Examen = examen;
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Integer getExamen() {
		return Examen;
	}
	public void setExamen(Integer examen) {
		Examen = examen;
	}

	
	@Override
	public String toString() {
		return "ConsultaExamen [idConsulta=" + idConsulta + ", Examen=" + Examen + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Examen == null) ? 0 : Examen.hashCode());
		result = prime * result + ((idConsulta == null) ? 0 : idConsulta.hashCode());
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
		ConsultaExamen other = (ConsultaExamen) obj;
		if (Examen == null) {
			if (other.Examen != null)
				return false;
		} else if (!Examen.equals(other.Examen))
			return false;
		if (idConsulta == null) {
			if (other.idConsulta != null)
				return false;
		} else if (!idConsulta.equals(other.idConsulta))
			return false;
		return true;
	}
	
	
}
