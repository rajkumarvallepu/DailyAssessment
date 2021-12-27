package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Long> {

}
