package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_Detalleconsulta")
public class DetalleConsulta {
		
	@Id
	private Integer idDetalle;
	
	/**
	@JsonIgnore: Es para evitar la redundancia ciclica
	*/
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name= "id_consulta", nullable = false)
	private Consulta consulta;
		
	@Column(name="diagnostico")
	private String diagnostico;
	
	@Column(name="tratamiento")
	private String tratamiento;
		
	public DetalleConsulta() {
		
	}
	
	public DetalleConsulta(Integer idDetalle, Consulta consulta, String diagnostico, String tratamiento) {
		this.idDetalle = idDetalle;
		this.consulta = consulta;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
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

		
	
	
	
	
}
