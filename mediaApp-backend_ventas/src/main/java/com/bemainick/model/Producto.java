package com.bemainick.model;

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

@EntityListeners(Producto.class)
@Entity
@Table(name= "Tb_Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name="nombre", nullable= false, length= 70)
	private String nombre;
	
	@Column(name="marca", nullable= false, length= 70)
	private String marca;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name= "id_detalleVenta", nullable = false)
	DetalleVenta detalleVenta; 
	
	public Producto() {
		
	}

	public Producto(Integer idProducto, String nombre, String marca) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.marca = marca;
	}

	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + "]";
	}
		
}
