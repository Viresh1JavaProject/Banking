package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Branch;

public interface Branchrepository extends JpaRepository<Branch, Integer> {

}
