package com.mitocode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity(name="tb_Consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsulta;
	
	/**
	 @JsonSerialize: debes agregar 2 convertores ==> Clases Utilitarias
	*/
	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name="fecha")	
	private LocalDate fecha;
		
	@ManyToOne
	@JoinColumn(name="id_paciente", nullable = false)
	Paciente paciente;
	 
	@ManyToOne
	@JoinColumn(name="id_especialidad", nullable = false)
	Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name="id_medico", nullable = false)
	Medico medico;
	
	/**
	CascadeType.PERSIST: Permite CRUD
	LAZY: te permite rendimiento de tus consultas
	orphanRemoval: Algunas veces se necesita elimnar elementos de la lista
	mappedBy= "consulta" : Debe ir el nombre de la variable que hace referencia a la Clase
						   Esta variable esta en la clase DetalleConsulta
	
	*/	
	@OneToMany(mappedBy= "consulta", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }
	           ,fetch = FetchType.LAZY, orphanRemoval = true)
	private List<DetalleConsulta>  detalleConsultas;
	
	public Consulta() {
		
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<DetalleConsulta> getDetalleConsultas() {
		return detalleConsultas;
	}
	public void setDetalleConsultas(List<DetalleConsulta> detalleConsultas) {
		this.detalleConsultas = detalleConsultas;
	}

	
	@Override
	public String toString() {
		return "Consulta [idConsulta=" + idConsulta + ", fecha=" + fecha + ", paciente=" + paciente + ", especialidad="
				+ especialidad + ", medico=" + medico + ", detalleConsultas=" + detalleConsultas + "]";
	}
		
}

