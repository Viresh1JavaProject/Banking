package com.banking.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Talukas {
	@Id
	private int tcode;
	private String name;
	@OneToMany
	List<Town> town;
	public Talukas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTcode() {
		return tcode;
	}
	public void setTcode(int tcode) {
		this.tcode = tcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Town> getTown() {
		return town;
	}
	public void setTown(List<Town> town) {
		this.town = town;
	}
	
	

}
