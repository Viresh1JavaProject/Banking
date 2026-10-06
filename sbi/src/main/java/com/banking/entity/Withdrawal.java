package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Withdrawal {

	@Id
	private int withdrawalId;
	private double withdrawalAmount;
	private String withdrawalDate;
	private String withdrawalMode;
	@ManyToOne
	Account account;
	@OneToOne
	Transaction transaction;
	public Withdrawal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWithdrawalId() {
		return withdrawalId;
	}
	public void setWithdrawalId(int withdrawalId) {
		this.withdrawalId = withdrawalId;
	}
	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}
	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}
	public String getWithdrawalDate() {
		return withdrawalDate;
	}
	public void setWithdrawalDate(String withdrawalDate) {
		this.withdrawalDate = withdrawalDate;
	}
	public String getWithdrawalMode() {
		return withdrawalMode;
	}
	public void setWithdrawalMode(String withdrawalMode) {
		this.withdrawalMode = withdrawalMode;
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
