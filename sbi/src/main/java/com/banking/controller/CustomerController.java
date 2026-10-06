	package com.banking.controller;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	import com.banking.entity.Customer;
	import com.banking.service.CustomerService;
	
	@RestController
	public class CustomerController {
	
		@Autowired
		CustomerService customerService;
		
		
		@PostMapping("/customer")
		public Customer saveCustomer(@RequestBody Customer customer) {
			return customerService.saveCustomer(customer);
		}
		
		@DeleteMapping("/customer/{id}")
		public Customer delteCustomer(@PathVariable int id) {
			return customerService.deleteCustomer(id);
		}
		
		@GetMapping("/customer/{id}")
		public Customer getCustomer(@PathVariable int id ) {
			return customerService.getCustomerById(id);
		}
			
		@GetMapping("/customer")
		public List<Customer> getAllCustomer( ) {
			return customerService.getAllCustomers();
		}
		
		@PutMapping("/customer/{id}")
		public Customer upadatCustomer(@PathVariable int id, @RequestBody Customer customer) {
			return customerService.updateCustomer(id, customer);
		}
		
		
	
	}
