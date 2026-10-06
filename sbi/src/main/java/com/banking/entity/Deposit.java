package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Deposit {

	@Id
	private int depositid;
	private double depositAmount;
	private String depositDate;
	private String depositMode;
	@ManyToOne
	Account account;
	@OneToOne 
	Transaction transaction;
	public Deposit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDepositid() {
		return depositid;
	}
	public void setDepositid(int depositid) {
		this.depositid = depositid;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}
	public String getDepositMode() {
		return depositMode;
	}
	public void setDepositMode(String depositMode) {
		this.depositMode = depositMode;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
}
