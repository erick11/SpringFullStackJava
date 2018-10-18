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

import com.mitocode.model.Usuario;
import com.mitocode.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
	
	/**
	@GetMapping: para servico get */
	@GetMapping(value= "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> listar(){
		List<Usuario> usuarios = new ArrayList<>();
				
		try {
			usuarios = service.listar();
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	@GetMapping(value= "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> listarId(@PathVariable ("id") Integer id) {
		Usuario usuario = new Usuario(); 
		
		try {
			usuario = service.listar(id);
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			//new ResponseEntity<String>("Error 14", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	/**
	@PostMapping: para realizar registros
	 * */
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario){
		/**
		@RequestBody: indicar que la clase Persona sera de typo JSON
		*/
		
		Usuario resUsuario = new Usuario(); 
		
		try {
			resUsuario =service.registrar(usuario);
			
		} catch (Exception e) {
			new ResponseEntity<>(resUsuario, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Usuario>(resUsuario, HttpStatus.OK);
	}
	
	/**
	@PutMapping: para realizar actualizaciones
	*/
	@PutMapping(value= "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Usuario usuario){
		int resultado = 0;
		
		try {
			service.modificar(usuario);
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
