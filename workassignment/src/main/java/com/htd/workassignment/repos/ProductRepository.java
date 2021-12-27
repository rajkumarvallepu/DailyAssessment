package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

}
