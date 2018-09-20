package com.mitocode.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

/**
 * @RestController: nueva version
 * @Controller: antigua version
   @RequestMapping: A la hora de consultar el servico antepones "persona"
 */

@RestController
@RequestMapping("/persona")
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
	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody Persona persona){
		/**
		@RequestBody: indicar que la clase Persona sera de typo JSON
		*/
		
		int resultado= 0;
		try {
			service.registrar(persona);
			resultado = 1;
		} catch (Exception e) {
			new ResponseEntity<>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}
	
	@PutMapping(value= "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Persona persona){
		int resultado = 0;
		
		try {
			service.modificar(persona);
			resultado = 1;
		} catch (Exception e) {
			new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK); 
		
	}
	
	@DeleteMapping(value= "/eliminar/{1}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> eliminar (@PathVariable Integer id){
		/**
		 /{1}         : Captura el atributo "id" en la url de la peticion
		 @PathVariable: Captura el atributo "id" en la url de la peticion 
		 * */
		
		int resultado = 0;
		
		try {
			service.eliminar(id);
			resultado= 1;
		} catch (Exception e) {
			new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return  new ResponseEntity<Integer>(resultado, HttpStatus.OK);
		
	}
	
	@GetMapping(value= "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Persona> listarId(@PathVariable ("id") Integer id) {
		Persona persona = new Persona(); 
		
		try {
			persona = service.listar(id);
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			//new ResponseEntity<String>("Error 14", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
}
