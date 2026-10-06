package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Bank;

public interface bankRepository extends JpaRepository<Bank, Integer> {

}
