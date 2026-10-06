package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AccountNominee {

	@Id
	private int accountNomineeId;
	private String nomineeName;
	private String relationship;
	private double sharePercentage;
	@ManyToOne
	Account account;
	@ManyToOne
	Nominee nominee;
	public AccountNominee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccountNomineeId() {
		return accountNomineeId;
	}
	public void setAccountNomineeId(int accountNomineeId) {
		this.accountNomineeId = accountNomineeId;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public double getSharePercentage() {
		return sharePercentage;
	}
	public void setSharePercentage(double sharePercentage) {
		this.sharePercentage = sharePercentage;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Nominee getNominee() {
		return nominee;
	}
	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}
	
}
