package com.htd.SpringSecurityWithDatabase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.SpringSecurityWithDatabase.entities.OrderDetail;

@Repository
public interface OrederDetailsRepository  extends JpaRepository<OrderDetail, Long>{
 
}
