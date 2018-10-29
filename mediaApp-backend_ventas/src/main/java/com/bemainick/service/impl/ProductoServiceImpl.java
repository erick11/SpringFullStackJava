package com.bemainick.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bemainick.dao.IProductoDao;
import com.bemainick.model.Producto;
import com.bemainick.service.IProductoService;

/**
 * @Service = serive para indicar los servicos para la anotacion @Autowired
 */
@Service
public class ProductoServiceImpl implements IProductoService{

	private IProductoDao dao;
	
	@Override
	public Producto registrar(Producto producto) {
		Producto pro = new Producto();
		try {
			
			pro = dao.save(producto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pro;
	}

	@Override
	public Producto modificar(Producto producto) {
		
		Producto pro = new Producto();
		try {
			
			pro = dao.save(producto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pro;
	}

	@Override
	public void eliminar(Integer cod) {

		try {
			
			dao.deleteById(cod);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Producto> listar() {
		
		try {
			
		return dao.findAll(); 	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Producto listar(Integer cod) {
		
		try {
			
			return dao.findById(cod).get();
			
		} catch (Exception e) {
			
		}
		
		return null;
	}

	
}
