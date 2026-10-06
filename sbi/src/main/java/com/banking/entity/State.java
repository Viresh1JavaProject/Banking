package com.banking.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class State {
	@Id
	private int scode;
	private String name;
	@OneToMany
	List<District> dist;
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getScode() {
		return scode;
	}
	public void setScode(int scode) {
		this.scode = scode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<District> getDist() {
		return dist;
	}
	public void setDist(List<District> dist) {
		this.dist = dist;
	}

}
