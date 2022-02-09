package com.qa.Nespresso.service;

import org.springframework.stereotype.Service;

import com.qa.Nespresso.domain.Nespresso;
import com.qa.Nespresso.repo.NespressoRepo;

@Service
public class NespressoService {
	
	private NespressoRepo repo;

	public NespressoService(NespressoRepo repo) {
		this.repo = repo;
	}

	// create method 
	public Nespresso createNespresso(Nespresso Nes) {
		return this.repo.save(Nes);
	}
	
	
}
