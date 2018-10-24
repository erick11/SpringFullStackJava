package com.mitocode.model.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.mitocode.model.Medico;

public class MedicoListener {
	
	@PrePersist
	public void listener_before_insert(Medico medico){
		System.out.println("@PrePersist" + medico.toString());
	}
	
	@PreUpdate
	public void listener_before_update(Medico medico){
		System.out.println("@PreUpdate");
	}
	
	@PreRemove
	public void listener_before_delete(Medico medico){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(Medico medico){
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(Medico medico){
		System.out.println("@PostPersist" + medico.toString());
	}
	
	@PostUpdate
	public void listener_after_update(Medico medico){
		System.out.println("@PostUpdate");
	}
	
	@PostRemove
	public void listener_after_delete(Medico medico){
		System.out.println("@PostRemove");
	}	
}
