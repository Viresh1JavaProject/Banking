package com.banking.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.Employee;
import com.banking.repository.EmployeeRepository;
import com.banking.service.FetchEmpById;

@Service
public class FetchEmployeeById implements FetchEmpById {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee FetchData(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

}
