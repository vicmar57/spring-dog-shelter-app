package com.vicmar57.dogshelter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Dog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private Date rescued;
	private Boolean vaccinated;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRescued() {
		return rescued;
	}
	public void setRescued(Date rescued) {
		this.rescued = rescued;
	}
	public Boolean getVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(Boolean vaccinated) {
		this.vaccinated = vaccinated;
	}
	
}
