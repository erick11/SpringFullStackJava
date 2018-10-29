package com.bemainick.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.bemainick.model.DetalleVenta;


public class DetalleVentaListener {

	@PrePersist
	public void listener_before_insert(DetalleVenta detalleVenta){
		System.out.println("@PrePersist" + detalleVenta.toString());
	}
	
	@PreUpdate
	public void listener_before_update(DetalleVenta detalleVenta){
		System.out.println("@PreUpdate" + detalleVenta.toString());
	}
	
	@PreRemove
	public void listener_before_delete(DetalleVenta detalleVenta){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(DetalleVenta detalleVenta){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(DetalleVenta detalleVenta){
		System.out.println("@PostPersist" + detalleVenta.toString());
	}
	
	@PostUpdate
	public void listener_after_update(DetalleVenta detalleVenta){
		System.out.println("@PostUpdate"+ detalleVenta.toString());
	}
	
	@PostRemove
	public void listener_after_delete(DetalleVenta detalleVenta){
		System.out.println("@PostRemove");
	}	
	
}
