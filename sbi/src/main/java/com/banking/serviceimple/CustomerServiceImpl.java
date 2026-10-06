package com.banking.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.Customer;
import com.banking.repository.CustomerRepository;
import com.banking.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		Customer existCustomer = customerRepository.findById(id).orElse(null);
		
		if (existCustomer != null) {
			existCustomer.setFirstName(customer.getFirstName());
			existCustomer.setMiddleName(customer.getMiddleName());
			existCustomer.setLastName(customer.getLastName());
			//	existCustomer.setAddress(customer.getAddress());
			existCustomer.setAdhar(customer.getAdhar());
			existCustomer.setDob(customer.getDob());
			existCustomer.setEmail(customer.getEmail());
			existCustomer.setMobile(customer.getMobile());
			existCustomer.setPan(customer.getPan());
			//existCustomer.setNominee(customer.getNominee());

			return customerRepository.save(existCustomer);
		}

		return null;
	}

	@Override
	public Customer deleteCustomer(int id) {

		Customer existCustomer = customerRepository.findById(id).orElse(null);
		if (existCustomer != null) {
			customerRepository.delete(existCustomer);
			return existCustomer;
		}

		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {

		return customerRepository.findAll();
	}

}
