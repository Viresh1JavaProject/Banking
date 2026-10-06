package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CurrentAccount {

	@Id
	private int currentAccountId;
	private double overdraftLimit;
	private String businessType;
	@OneToOne
	Account account;
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCurrentAccountId() {
		return currentAccountId;
	}
	public void setCurrentAccountId(int currentAccountId) {
		this.currentAccountId = currentAccountId;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
