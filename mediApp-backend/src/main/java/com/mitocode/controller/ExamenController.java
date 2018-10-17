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

import com.mitocode.model.Examen;
import com.mitocode.service.IExamenService;;

@RestController
@RequestMapping("/examen")
public class ExamenController {

	@Autowired
	private IExamenService service;
	
	/**
	@GetMapping: para servico get */
	@GetMapping(value= "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Examen>> listar(){
		List<Examen> examenes = new ArrayList<>();
				
		try {
			examenes = service.listar();
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Examen>>(examenes, HttpStatus.OK);
	}
	
	@GetMapping(value= "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Examen> listarId(@PathVariable ("id") Integer id) {
		Examen examen = new Examen(); 
		
		try {
			examen = service.listar(id);
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		
		return new ResponseEntity<Examen>(examen, HttpStatus.OK);
	}
		
	/**
	@PostMapping: para realizar registros
	 * */
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Examen> registrar(@RequestBody Examen examen){
		/**
		@RequestBody: indicar que la clase Persona sera de typo JSON
		*/
		
		Examen resExa = new Examen(); 
		
		try {
			resExa =service.registrar(examen);
			
		} catch (Exception e) {
			new ResponseEntity<>(resExa, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Examen>(resExa, HttpStatus.OK);
	}
	
	/**
	@PutMapping: para realizar actualizaciones
	*/
	@PutMapping(value= "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Examen examen){
		int resultado = 0;
		
		try {
			service.modificar(examen);
			resultado = 1;
		} catch (Exception e) {
			new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK); 
		
	}

	/**
	@DeleteMapping: Elimnar registros
	*/
	@DeleteMapping(value= "/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
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
		
}
