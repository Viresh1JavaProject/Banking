package com.banking.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class District {
	@Id
	private int dcode;
	private String name;
	@OneToMany
	List<Talukas> talukas;
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDcode() {
		return dcode;
	}
	public void setDcode(int dcode) {
		this.dcode = dcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Talukas> getTalukas() {
		return talukas;
	}
	public void setTalukas(List<Talukas> talukas) {
		this.talukas = talukas;
	}

}
