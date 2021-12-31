package com.htd.SpringSecurityWithDatabase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.SpringSecurityWithDatabase.entities.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long>{
 
}
