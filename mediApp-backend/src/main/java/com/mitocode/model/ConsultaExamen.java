package com.mitocode.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ConsultaExamenPK.class)
@Table(name="tb_ConsultaExamen")
public class ConsultaExamen {
	
	@Id
	private Examen examen;
	
	@Id
	private Consulta consulta;

	public ConsultaExamen() {
		
	}

	public ConsultaExamen(Examen examen, Consulta consulta) {
		super();
		this.examen = examen;
		this.consulta = consulta;
	}

	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}


		
}
