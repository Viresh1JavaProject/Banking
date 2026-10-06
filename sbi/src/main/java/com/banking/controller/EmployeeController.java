package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.Employee;
import com.banking.service.Create;
import com.banking.service.Delete;
import com.banking.service.FetchEmpById;
import com.banking.service.FetchEmployee;
import com.banking.service.UpdateEmployee;

@RestController
public class EmployeeController {

	@Autowired
	Create create;

	@Autowired
	Delete delete;

	@Autowired
	FetchEmpById fetchEmpById;

	@Autowired
	FetchEmployee fetchEmployee;

	@Autowired
	UpdateEmployee updateEmployee;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return create.saveData(employee);
	}

	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return delete.DeleteData(id);
	}

	@GetMapping("/employee/{id}")
	public Employee fetchEmployeeById(@PathVariable int id) {
		return fetchEmpById.FetchData(id);
	}

	@GetMapping("/employee/fetch/{id}")
	public Employee fetchEmployee(@PathVariable int id) {
		return fetchEmployee.FetchData(id);
	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return updateEmployee.UpdateData(id, employee);
	}

}
