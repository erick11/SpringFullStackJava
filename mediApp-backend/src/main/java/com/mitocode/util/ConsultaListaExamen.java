package com.mitocode.util;

import java.util.List;

import com.mitocode.model.Consulta;
import com.mitocode.model.Examen;

/**
DTO: UNA CONSULTA COMPLEJA 
*/

public class ConsultaListaExamen {

	private Consulta consulta;
	private List<Examen> examenes;
	
	public ConsultaListaExamen() {
		
	}

	public ConsultaListaExamen(Consulta consulta, List<Examen> examenes) {
		super();
		this.consulta = consulta;
		this.examenes = examenes;
	}

	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Examen> getExamenes() {
		return examenes;
	}
	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}

	@Override
	public String toString() {
		return "ConsultaListaExamen [consulta=" + consulta + ", examenes=" + examenes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consulta == null) ? 0 : consulta.hashCode());
		result = prime * result + ((examenes == null) ? 0 : examenes.hashCode());
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
		ConsultaListaExamen other = (ConsultaListaExamen) obj;
		if (consulta == null) {
			if (other.consulta != null)
				return false;
		} else if (!consulta.equals(other.consulta))
			return false;
		if (examenes == null) {
			if (other.examenes != null)
				return false;
		} else if (!examenes.equals(other.examenes))
			return false;
		return true;
	}
		
}
