package com.qa.Nespresso.service;

import java.util.List;
import java.util.Optional;

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

	// read method
	public Nespresso getByIDNespresso(Long id) {
		Optional<Nespresso> get = this.repo.findById(id);
		return get.orElse(null);
	}
 
	// update method
	public Nespresso updateNespresso(Long id, Nespresso Nes) {
		Optional<Nespresso> optionalNespresso = this.repo.findById(id);
		if (optionalNespresso.isPresent()) {
			Nespresso existingNespresso = optionalNespresso.get();
			existingNespresso.setName(Nes.getName());
			existingNespresso.setType(Nes.getType());
			existingNespresso.setIntensity(Nes.getIntensity());
			existingNespresso.setAroma(Nes.getAroma());
			existingNespresso.setRoastiness(Nes.getRoastiness());
			return this.repo.save(existingNespresso);
		} else {
			return null;
		}
	}

	//read all method 
	public List<Nespresso> readAllNespresso() {
		return this.repo.findAll();
	}
	
	// delete method
	public boolean deleteNespresso(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
