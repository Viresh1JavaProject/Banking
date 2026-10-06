package com.banking.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class JointAccount {

	@Id
	private int jointAccountId;
	private String accountname;
	private String openingDate;
	@OneToOne
	Account account;
	@ManyToMany
	List<Customer> customers;
	public JointAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getJointAccountId() {
		return jointAccountId;
	}
	public void setJointAccountId(int jointAccountId) {
		this.jointAccountId = jointAccountId;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
