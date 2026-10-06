package com.banking.entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Bank {
	@Id
	private int regNo;
	private String name;
	@OneToOne
	private Address address;
	@OneToMany(targetEntity=Customer.class)
	private List<Customer> customers;
	@OneToMany(targetEntity=Dept.class)
	private List<Dept> depts;
	@OneToMany(targetEntity=Employee.class)
	private List<Employee> employees;
	@OneToMany(targetEntity=Agent.class)
	private List<Agent> agents;
	@OneToMany(targetEntity=Branch.class)
	private List<Branch> branch;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Agent> getAgents() {
		return agents;
	}
	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

	

}
