package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
