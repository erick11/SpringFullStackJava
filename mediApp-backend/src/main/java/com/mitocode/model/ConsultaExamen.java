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

	public Integer getIdExamen() {
		return idExamen;
	}


	public void setIdExamen(Integer idExamen) {
		this.idExamen = idExamen;
	}


	
	@Override
	public String toString() {
		return "ConsultaExamen [idConsulta=" + idConsulta + ", idExamen=" + idExamen + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idConsulta == null) ? 0 : idConsulta.hashCode());
		result = prime * result + ((idExamen == null) ? 0 : idExamen.hashCode());
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
		if (idConsulta == null) {
			if (other.idConsulta != null)
				return false;
		} else if (!idConsulta.equals(other.idConsulta))
			return false;
		if (idExamen == null) {
			if (other.idExamen != null)
				return false;
		} else if (!idExamen.equals(other.idExamen))
			return false;
		return true;
	}

	
	

	
	


	
}
