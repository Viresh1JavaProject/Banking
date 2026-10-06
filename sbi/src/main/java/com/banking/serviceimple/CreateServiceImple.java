package com.banking.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.Employee;
import com.banking.repository.EmployeeRepository;
import com.banking.service.Create;

@Service
public class CreateServiceImple implements Create {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}
