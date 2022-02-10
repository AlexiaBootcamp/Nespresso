package com.qa.Nespresso.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.Nespresso.domain.Nespresso;

//change from a class to interface
@Repository
public interface NespressoRepo extends JpaRepository<Nespresso, Long> {
	
}
