package com.mitocode.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.mitocode.model.Consulta;

public class ConsultaListener {

	@PrePersist
	public void listener_before_insert(Consulta consulta){
		System.out.println("@PrePersist" + consulta.toString());
	}
	
	@PreUpdate
	public void listener_before_update(Consulta consulta){
		System.out.println("@PreUpdate");
	}
	
	@PreRemove
	public void listener_before_delete(Consulta consulta){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(Consulta consulta){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(Consulta consulta){
		System.out.println("@PostPersist" + consulta.toString());
	}
	
	@PostUpdate
	public void listener_after_update(Consulta consulta){
		System.out.println("@PostUpdate");
	}
	
	@PostRemove
	public void listener_after_delete(Consulta consulta){
		System.out.println("@PostRemove");
	}
	
}
