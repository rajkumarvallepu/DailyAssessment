package com.htd.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.entities.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

}
