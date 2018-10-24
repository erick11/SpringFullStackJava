package com.mitocode.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
@Embeddable: 
*/
@Embeddable
public class ConsultaExamenPK {

	@ManyToOne
	@JoinColumn(name= "idExamen", nullable= false)
	private Examen examen;
	
	@ManyToOne
	@JoinColumn(name= "idConsulta", nullable= false)
	private Consulta consulta;
	
	
	
	/**
	hashCode() - equals(Object obj): 
	    Se recomienda sobreescribir estos metodos para realizar la comparacion por valores
	    y no por instancia en memoria 	
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consulta == null) ? 0 : consulta.hashCode());
		result = prime * result + ((examen == null) ? 0 : examen.hashCode());
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
		ConsultaExamenPK other = (ConsultaExamenPK) obj;
		if (consulta == null) {
			if (other.consulta != null)
				return false;
		} else if (!consulta.equals(other.consulta))
			return false;
		if (examen == null) {
			if (other.examen != null)
				return false;
		} else if (!examen.equals(other.examen))
			return false;
		return true;
	}
		
}
