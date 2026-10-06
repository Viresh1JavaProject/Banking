package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.State;

public interface StateRepository extends JpaRepository<State, Integer>{

}
