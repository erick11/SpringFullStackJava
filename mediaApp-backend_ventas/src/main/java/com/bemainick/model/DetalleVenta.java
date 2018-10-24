package com.bemainick.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "Tb_DetalleVenta")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idDetalleVenta;
	
	/**
	@JsonIgnore: Es para evitar la redundancia ciclica
	*/
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name= "id_venta", nullable = false)
	private Venta venta;
	
	@OneToMany(mappedBy= "detalleVenta")
	private List<Producto> productos;
	
	@Column(name="cmp", nullable= false)
	private Integer cantidad;
	
	public DetalleVenta() {
		
	}

	public DetalleVenta(Integer idDetalleVenta, Venta venta, List<Producto> productos, Integer cantidad) {
		super();
		this.idDetalleVenta = idDetalleVenta;
		this.venta = venta;
		this.productos = productos;
		this.cantidad = cantidad;
	}

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}
	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
		
	public List<Producto> getProductos() {
		return productos;
	}

	public void addProducto(Producto f) {
		productos.add(f);
    }
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleVenta [idDetalleVenta=" + idDetalleVenta + ", venta=" + venta + ", productos=" + productos
				+ ", cantidad=" + cantidad + "]";
	}
	
}
