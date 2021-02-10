package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Technology {
	
	@Id
	private Long technologyId;
	
	private String technologyName;

	public Long getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(Long technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	
	

}
