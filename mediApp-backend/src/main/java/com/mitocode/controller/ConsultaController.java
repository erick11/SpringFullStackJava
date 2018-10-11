package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Consulta;
import com.mitocode.service.IConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
	@Autowired
	private IConsultaService service;
	
	/**@GetMapping: para servico get */
	@GetMapping(value= "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Consulta>> listar(){
		List<Consulta> consultas = new ArrayList<>();
				
		try {
			consultas = service.listar();
		} catch (Exception e) {
			new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<List<Consulta>>(consultas, HttpStatus.OK);
	}
	
	
	/**
	 @PostMapping: para realizar registros
	 * */
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Consulta> registrar(@RequestBody Consulta consulta){
		/**
		@RequestBody: indicar que la clase Persona sera de typo JSON
		*/
		
		Consulta resConsulta = new Consulta(); 

		try {
			resConsulta =service.registrar(consulta);
			
		} catch (Exception e) {
			new ResponseEntity<>(resConsulta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Consulta>(resConsulta, HttpStatus.OK);
	}

}
