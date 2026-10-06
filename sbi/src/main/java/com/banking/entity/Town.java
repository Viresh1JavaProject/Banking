package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Town {
	@Id
	private int tid;
	private String name;
	private int pincode;
	public Town() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
