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

import com.mitocode.model.Especialidad;
import com.mitocode.model.Medico;
import com.mitocode.service.IEspecialidadService;

@RestController
@RequestMapping("/medico")
public class EspecialidadController {
	
	@Autowired
	private IEspecialidadService service;
	
	/**@GetMapping: para servico get */
	@GetMapping(value= "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Especialidad>> listar(){
		List<Especialidad> especialidades = new ArrayList<>();
				
		try {
			especialidades = service.listar();
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Especialidad>>(especialidades, HttpStatus.OK);
	}
		
	/**
	@PostMapping: para realizar registros
	 * */
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Especialidad> registrar(@RequestBody Especialidad especialidad){
		/**
		@RequestBody: indicar que la clase Persona sera de typo JSON
		*/
		
		Especialidad resEspecialidad = new Especialidad(); 
		int resultado= 0;
		try {
			resEspecialidad =service.registrar(especialidad);
			
		} catch (Exception e) {
			new ResponseEntity<>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Especialidad>(resEspecialidad, HttpStatus.OK);
	}
	
	/**
	@PutMapping: para realizar actualizaciones
	*/
	@PutMapping(value= "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Especialidad especialidad){
		int resultado = 0;
		
		try {
			service.modificar(especialidad);
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
	
	@GetMapping(value= "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Especialidad> listarId(@PathVariable ("id") Integer id) {
		Especialidad especialidad = new Especialidad();  
		
		try {
			especialidad = service.listar(id);
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			//new ResponseEntity<String>("Error 14", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Especialidad>(especialidad, HttpStatus.OK);
	}

}
