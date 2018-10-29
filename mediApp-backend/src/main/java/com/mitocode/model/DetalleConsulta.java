package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mitocode.model.listener.DetalleConsultaListener;
import com.mitocode.model.listener.MedicoListener;

@EntityListeners(DetalleConsultaListener.class)
@Entity
@Table(name="tb_Detalleconsulta")
public class DetalleConsulta {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleConsulta;
	
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
	
	public DetalleConsulta(Integer idDetalleConsulta, Consulta consulta, String diagnostico, String tratamiento) {
		this.idDetalleConsulta = idDetalleConsulta;
		this.consulta = consulta;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public Integer getIdDetalle() {
		return idDetalleConsulta;
	}
	public void setIdDetalle(Integer idDetalleConsulta) {
		this.idDetalleConsulta = idDetalleConsulta;
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

	/**
	Debe evitar poner  la clase que donde se llaman las lista. En este caso es 
	Consulta
	*/
	@Override
	public String toString() {
		return "DetalleConsulta [idDetalleConsulta=" + idDetalleConsulta +  ", diagnostico="
				+ diagnostico + ", tratamiento=" + tratamiento + "]";
	}

}
