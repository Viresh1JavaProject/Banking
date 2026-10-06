package com.banking.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.Employee;
import com.banking.repository.EmployeeRepository;
import com.banking.service.Delete;

@Service
public class DeleteServiceImple implements Delete {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee DeleteData(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).map(employee -> {
			employeeRepository.deleteById(id);
			return employee;
		}).orElse(null);
	}

}
