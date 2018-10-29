package com.bemainick.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bemainick.dao.IVentaDao;
import com.bemainick.model.Venta;
import com.bemainick.service.IVentaService;

/**
 * @Service = serive para indicar los servicos para la anotacion @Autowired
 */
@Service
public class VentaServiceImpl implements IVentaService{

	
	private IVentaDao dao;
	
	@Override
	public Venta registrar(Venta venta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta modificar(Venta venta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer cod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta listar(Integer cod) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
