package com.bemainick.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@EntityListeners(Venta.class) 
@Entity
@Table(name= "Tb_Venta")
public class Venta {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idVenta;
	/**
	@JsonSerialize: debes agregar 2 convertores ==> Clases Utilitarias
	*/
	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name="fecha")	
	private LocalDate fecha;
	
	@ManyToOne
	@JoinColumn(name="id_persona", nullable = false)
	Persona persona;
	
	@Column(name="importe", nullable= false)
	private double importe;

	/**
	CascadeType.PERSIST: Permite CRUD
	LAZY: te permite rendimiento de tus consultas
	orphanRemoval: Algunas veces se necesita elimnar elementos de la lista
	mappedBy= "venta" : Debe ir el nombre de la variable que hace referencia a la Clase
						   Esta variable esta en la clase DetalleConsulta
	
	*/
	@OneToMany(mappedBy= "venta", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE },fetch = FetchType.LAZY, orphanRemoval = true)
	private List<DetalleVenta>  detalleVentas;

	public Venta() {
		
	}
	
	public Venta(Integer idVenta, LocalDate fecha, Persona persona, double importe) {
		super();
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.persona = persona;
		this.importe = importe;
	}

	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	/**
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	*/
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", fecha=" + fecha + ", persona=" + persona + ", importe=" + importe + "]";
	}

}
