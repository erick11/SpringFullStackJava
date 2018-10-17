package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.UsuarioDao;
import com.mitocode.model.Usuario;
import com.mitocode.service.IUsuarioService;

/**
@Service = serive para indicar los servicos para la anotacion @Autowired	
*/
@Service
public class UsuarioServiceImpl implements IUsuarioService{

	/**
	@Autowired: anotacion obligatoria
	 * */
	@Autowired
	private UsuarioDao dao;

	@Override
	public Usuario registrar(Usuario usuario) {		
		return dao.save(usuario);
	}

	@Override
	public void modificar(Usuario usuario) {
		dao.save(usuario);		
	}

	@Override
	public void eliminar(Integer cod) {
		dao.deleteById(cod);		
	}

	@Override
	public List<Usuario> listar() {
		return dao.findAll();
	}

	@Override
	public Usuario listar(Integer cod) {
		return dao.findById(cod).get();
	}
	
	

	
	
}
