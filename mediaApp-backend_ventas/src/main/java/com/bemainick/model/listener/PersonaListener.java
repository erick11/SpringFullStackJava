package com.bemainick.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.bemainick.model.Producto;

public class PersonaListener {

	@PrePersist
	public void listener_before_insert(Producto producto){
		System.out.println("@PrePersist" + producto.toString());
	}
	
	@PreUpdate
	public void listener_before_update(Producto producto){
		System.out.println("@PreUpdate" + producto.toString());
	}
	
	@PreRemove
	public void listener_before_delete(Producto producto){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(Producto producto){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(Producto producto){
		System.out.println("@PostPersist" + producto.toString());
	}
	
	@PostUpdate
	public void listener_after_update(Producto producto){
		System.out.println("@PostUpdate"+ producto.toString());
	}
	
	@PostRemove
	public void listener_after_delete(Producto producto){
		System.out.println("@PostRemove");
	}	

}
