package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
