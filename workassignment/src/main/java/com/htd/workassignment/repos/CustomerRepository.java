package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

}
