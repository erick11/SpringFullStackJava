package com.bemainick.service;

import java.util.List;

import com.bemainick.model.Producto;

public interface IProductoService {

	Producto registrar (Producto producto);
	Producto modificar (Producto producto);
	void eliminar (Integer cod);
	
	List<Producto> listar();
	Producto listar (Integer cod);
	
}
