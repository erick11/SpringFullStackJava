package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Usuario;

public interface IUsuarioService {

	Usuario registrar (Usuario usuario);
	void modificar (Usuario usuario);
	void eliminar(Integer cod);
	
	List<Usuario> listar();
 	Usuario listar(Integer cod);
	
}
