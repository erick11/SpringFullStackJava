package com.mitocode.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
/**
 @Service = serive para indicar los servicos para la anotacion @Autowired	
 */
@Service
public class PersonaServiceImpl implements IPersonaService{

	@Override
	public void registrar(Persona per) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Persona per) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Persona per) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona listar(int id) {

		
		return null;
	}

	@Override
	public List<Persona> listar() {
		List <Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Erick Eduardo", "Navarrete Guerrero", 29));
		lista.add(new Persona(2, "Ryan Joseph", "Navarrete Guerrero", 29));
		lista.add(new Persona(3, "Cristiano Ronaldo", "dos Santos Aveiro", 29));
		lista.add(new Persona(4, "Marco ", "Reus", 29));
		
		return lista;
	}

}
