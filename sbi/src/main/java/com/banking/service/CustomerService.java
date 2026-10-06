	package com.banking.service;

import java.util.List;

import com.banking.entity.Customer;

public interface CustomerService {
		
		Customer saveCustomer(Customer customer);
		Customer getCustomerById(int id);
		Customer updateCustomer(int id , Customer customer);
		Customer deleteCustomer(int id);
		
		List<Customer> getAllCustomers();
	
	}
