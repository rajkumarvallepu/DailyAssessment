package com.htd.SpringSecurityWithDatabase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htd.SpringSecurityWithDatabase.entities.CompanyUser;

@Repository
public interface UserCompanyRepository extends JpaRepository<CompanyUser,Long>{
 
}
