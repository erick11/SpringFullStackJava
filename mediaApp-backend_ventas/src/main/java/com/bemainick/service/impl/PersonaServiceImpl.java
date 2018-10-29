package com.bemainick.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bemainick.dao.IPersonaDao;
import com.bemainick.model.Persona;
import com.bemainick.service.IPersonaService;

/**
 * @Service = serive para indicar los servicos para la anotacion @Autowired
 */
@Service
public class PersonaServiceImpl implements IPersonaService {

	/**
	 * @Autowired: anotacion obligatoria
	 */
	@Autowired
	private IPersonaDao dao;

	@Override
	public Persona registrar(Persona persona) {

		Persona per = new Persona();

		try {

			per = dao.save(persona);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return per;
	}

	@Override
	public Persona modificar(Persona persona) {
		Persona per = new Persona();

		try {

			per = dao.save(persona);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return per;
	}

	@Override
	public void eliminar(Integer cod) {
		
		try {
			dao.deleteById(cod);
		} catch (Exception e) {
			
		}

	}

	@Override
	public List<Persona> listar() {
		List<Persona> list = null; 
		
		try {
		
		list = dao.findAll();
		return 	list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Persona listar(Integer cod) {
		
		Persona per = new Persona();
		
		try {
			per = dao.findById(cod).get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return per;
	}

}
