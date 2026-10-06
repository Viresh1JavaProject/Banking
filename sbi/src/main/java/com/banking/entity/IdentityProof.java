package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class IdentityProof {

	@Id
	private int proofId;
	private String proofType;
	private String proofNumber;
	private String issueDate;
	private String expirydate;
	@ManyToOne
	Customer customer;
	public IdentityProof() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProofId() {
		return proofId;
	}
	public void setProofId(int proofId) {
		this.proofId = proofId;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofNumber() {
		return proofNumber;
	}
	public void setProofNumber(String proofNumber) {
		this.proofNumber = proofNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
