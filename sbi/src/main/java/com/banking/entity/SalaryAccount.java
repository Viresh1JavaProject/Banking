package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SalaryAccount {

	@Id
	private int salaryAccountId;
	private double salaryAmount;
	private String employerName;
	@OneToOne
	Account account;
	public SalaryAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSalaryAccountId() {
		return salaryAccountId;
	}
	public void setSalaryAccountId(int salaryAccountId) {
		this.salaryAccountId = salaryAccountId;
	}
	public double getSalaryAmount() {
		return salaryAmount;
	}
	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
