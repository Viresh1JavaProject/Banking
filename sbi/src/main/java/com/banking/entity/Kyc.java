package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Kyc {

	@Id
	private int kycId;
	private String kycStatus;
	private String verificationDate;
	private String verifiedBy;
	@OneToOne
	Customer customer;
	public Kyc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getKycId() {
		return kycId;
	}
	public void setKycId(int kycId) {
		this.kycId = kycId;
	}
	public String getKycStatus() {
		return kycStatus;
	}
	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}
	public String getVerificationDate() {
		return verificationDate;
	}
	public void setVerificationDate(String verificationDate) {
		this.verificationDate = verificationDate;
	}
	public String getVerifiedBy() {
		return verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
