package com.mitocode.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.dao.IPersonaDAO;
import com.mitocode.model.Persona;
/**
 @Service = serive para indicar los servicos para la anotacion @Autowired	
 */
@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDAO dao; 
	
	
	@Override
	public void registrar(Persona per) {
		
		dao.save(per);
	}

	@Override
	public void modificar(Persona per) {

		dao.save(per);
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public Persona listar(Integer id) {
		
		return dao.findOne(id);
	}

	@Override
	public List<Persona> listar() {
//		List <Persona> lista = new ArrayList<>();
//		lista.add(new Persona(1, "Erick Eduardo", "Navarrete Guerrero", 29));
//		lista.add(new Persona(2, "Ryan Joseph", "Navarrete Guerrero", 29));
//		lista.add(new Persona(3, "Cristiano Ronaldo", "dos Santos Aveiro", 29));
//		lista.add(new Persona(4, "Marco ", "Reus", 29));
//		
//		return lista;
		
		return dao.findAll();
	
	}
	

}
