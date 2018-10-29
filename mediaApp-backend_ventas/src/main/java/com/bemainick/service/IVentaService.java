package com.bemainick.service;

import java.util.List;

import com.bemainick.model.Venta;

public interface IVentaService {

	Venta registrar (Venta venta);
	Venta modificar (Venta venta);
	void eliminar (Integer cod);
	
	List<Venta> listar();
	Venta listar (Integer cod);
	
}
