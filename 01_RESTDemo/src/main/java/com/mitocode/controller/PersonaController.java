package com.mitocode.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

/**
 * @RestController: nueva version
 * @Controller: antigua version
 */

@RestController
public class PersonaController {

	@Autowired
	private IPersonaService service;

	
	/* 
	 * List<Persona> ==> ResponseEntity<T>. Se cambia debido a que es un
	 * servicio REST. Spring maneja sus porpios datos para en el manejo 
	 * de valores en servicios REST    
	 * */
	/**
	 @GetMapping = Publicar el servicio
	 */
	
	@GetMapping(value= "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<Persona>> listar() {
		List<Persona> personas = new ArrayList<>(); 
		
		try {
			personas = service.listar();
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			//new ResponseEntity<String>("Error 14", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Persona>>(personas, HttpStatus.OK);
	}

}
