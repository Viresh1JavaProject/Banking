package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
