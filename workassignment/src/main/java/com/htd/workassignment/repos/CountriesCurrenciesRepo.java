package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.CountriesCurrencies;

@Repository
public interface CountriesCurrenciesRepo extends JpaRepository<CountriesCurrencies, Long> {

}
