package com.bemainick.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.bemainick.model.Persona;

public class ProductoListener {
	
	@PrePersist
	public void listener_before_insert(Persona persona){
		System.out.println("@PrePersist" + persona.toString());
	}
	
	@PreUpdate
	public void listener_before_update(Persona persona){
		System.out.println("@PreUpdate" + persona.toString());
	}
	
	@PreRemove
	public void listener_before_delete(Persona persona){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(Persona persona){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(Persona persona){
		System.out.println("@PostPersist" + persona.toString());
	}
	
	@PostUpdate
	public void listener_after_update(Persona persona){
		System.out.println("@PostUpdate"+ persona.toString());
	}
	
	@PostRemove
	public void listener_after_delete(Persona persona){
		System.out.println("@PostRemove");
	}	

}
