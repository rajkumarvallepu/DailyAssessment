package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
