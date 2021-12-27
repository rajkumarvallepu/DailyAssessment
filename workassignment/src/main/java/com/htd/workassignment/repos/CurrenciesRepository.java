package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Currencies;

@Repository
public interface CurrenciesRepository extends JpaRepository<Currencies, Long> {

}
