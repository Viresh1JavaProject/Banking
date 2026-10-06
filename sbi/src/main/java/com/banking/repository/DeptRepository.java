package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer>{

}
