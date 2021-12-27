package com.htd.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}