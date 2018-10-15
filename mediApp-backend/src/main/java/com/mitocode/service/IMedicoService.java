package com.mitocode.service;

import java.util.List;
import com.mitocode.model.Medico;

public interface IMedicoService {

	Medico registrar (Medico med);
	void modificar (Medico med);
	void eliminar (Integer cod);
	
	List<Medico> listar();
	Medico listar (Integer cod);
	
}
