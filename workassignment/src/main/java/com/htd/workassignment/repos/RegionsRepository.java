package com.htd.workassignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.workassignment.entities.Regions;

@Repository
public interface RegionsRepository extends JpaRepository<Regions, Long> {

}
