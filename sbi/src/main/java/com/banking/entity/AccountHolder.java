package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AccountHolder {
	@Id
	private int holderId;
	private String holderName;
	private String holderType;
	@ManyToOne
	Account account;
	@ManyToOne
	Customer customer;
	public AccountHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHolderId() {
		return holderId;
	}
	public void setHolderId(int holderId) {
		this.holderId = holderId;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getHolderType() {
		return holderType;
	}
	public void setHolderType(String holderType) {
		this.holderType = holderType;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
