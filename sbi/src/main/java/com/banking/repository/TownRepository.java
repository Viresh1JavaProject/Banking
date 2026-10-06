package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Town;

public interface TownRepository extends JpaRepository<Town, Integer>{

}
