package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {

}
