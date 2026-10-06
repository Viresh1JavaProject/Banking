package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SavingsAccount {

	@Id
	private int savingAccountId;
	private double interestRate;
	private double minimumBalance;
	@OneToOne
	Account account;
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSavingAccountId() {
		return savingAccountId;
	}
	public void setSavingAccountId(int savingAccountId) {
		this.savingAccountId = savingAccountId;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
