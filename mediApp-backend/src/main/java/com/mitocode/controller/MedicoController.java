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

import com.mitocode.model.Medico;
import com.mitocode.model.Paciente;
import com.mitocode.service.IMedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	private IMedicoService service;
	
	/**@GetMapping: para servico get */
	@GetMapping(value= "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Medico>> listar(){
		List<Medico> medicos = new ArrayList<>();
				
		try {
			medicos = service.listar();
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Medico>>(medicos, HttpStatus.OK);
	}
	
	/**
	 @PostMapping: para realizar registros
	 * */
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Medico> registrar(@RequestBody Medico medico){
		/**
		@RequestBody: indicar que la clase Persona sera de typo JSON
		*/
		
		Medico resMedico = new Medico(); 
		int resultado= 0;
		try {
			resMedico =service.registrar(medico);
			resultado = 1;
		} catch (Exception e) {
			new ResponseEntity<>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Medico>(resMedico, HttpStatus.OK);
	}
	
	/**
	@PutMapping: para realizar actualizaciones
	*/
	@PutMapping(value= "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Medico medico){
		int resultado = 0;
		
		try {
			service.modificar(medico);
			resultado = 1;
		} catch (Exception e) {
			new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Integer>(resultado, HttpStatus.OK); 
		
	}
	
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
	public ResponseEntity<Medico> listarId(@PathVariable ("id") Integer id) {
		Medico medico = new Medico(); 
		
		try {
			medico = service.listar(id);
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			//new ResponseEntity<String>("Error 14", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Medico>(medico, HttpStatus.OK);
	}
}
