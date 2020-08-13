package com.cispring.dockerci.repository;

import com.cispring.dockerci.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}
