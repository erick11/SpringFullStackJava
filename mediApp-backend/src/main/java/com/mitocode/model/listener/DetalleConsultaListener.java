package com.mitocode.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.mitocode.model.DetalleConsulta;

public class DetalleConsultaListener {

	
	@PrePersist
	public void listener_before_insert(DetalleConsulta detalleConsulta){
		System.out.println("@PrePersist" + detalleConsulta.toString());
	}
	
	@PreUpdate
	public void listener_before_update(DetalleConsulta detalleConsulta){
		System.out.println("@PreUpdate");
	}
	
	@PreRemove
	public void listener_before_delete(DetalleConsulta detalleConsulta){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(DetalleConsulta detalleConsulta){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(DetalleConsulta detalleConsulta){
		System.out.println("@PostPersist" + detalleConsulta.toString());
	}
	
	@PostUpdate
	public void listener_after_update(DetalleConsulta detalleConsulta){
		System.out.println("@PostUpdate");
	}
	
	@PostRemove
	public void listener_after_delete(DetalleConsulta detalleConsulta){
		System.out.println("@PostRemove");
	}	
}
