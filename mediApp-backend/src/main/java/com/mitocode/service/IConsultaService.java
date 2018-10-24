package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Consulta;
import com.mitocode.util.ConsultaListaExamen;

public interface IConsultaService {

	Consulta registrar(Consulta consulta);
	
	Consulta registrarDTO(ConsultaListaExamen consultaListaExamenDTO);
	
	void modificar(Consulta consulta);

	void eliminar(Integer cod);

	List<Consulta> listar();
	
	Consulta listar(Integer cod);
	
}
