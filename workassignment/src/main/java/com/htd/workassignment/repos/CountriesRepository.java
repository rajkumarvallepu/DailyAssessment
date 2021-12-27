package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {

}
