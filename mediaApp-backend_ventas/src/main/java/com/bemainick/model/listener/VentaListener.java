package com.bemainick.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.bemainick.model.Venta;;

public class VentaListener {

	@PrePersist
	public void listener_before_insert(Venta venta){
		System.out.println("@PrePersist" + venta.toString());
	}
	
	@PreUpdate
	public void listener_before_update(Venta venta){
		System.out.println("@PreUpdate" + venta.toString());
	}
	
	@PreRemove
	public void listener_before_delete(Venta venta){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(Venta venta){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(Venta venta){
		System.out.println("@PostPersist" + venta.toString());
	}
	
	@PostUpdate
	public void listener_after_update(Venta venta){
		System.out.println("@PostUpdate"+ venta.toString());
	}
	
	@PostRemove
	public void listener_after_delete(Venta venta){
		System.out.println("@PostRemove");
	}	

}
