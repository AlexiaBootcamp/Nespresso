package com.qa.Nespresso.service;

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
		return this.repo.getById(id);
	}

	// update method
	public Nespresso updateNespresso(Long id, Nespresso Nes) {
		Optional<Nespresso> optionalNespresso = this.repo.findById(id);
		if (optionalNespresso.isPresent()) {
			Nespresso existingNespresso = optionalNespresso.get();
			existingNespresso.setName(Nes.getName());
			existingNespresso.setType(Nes.getType());
			existingNespresso.setAroma(Nes.getAroma());
			existingNespresso.setIntensity(Nes.getIntensity());
			existingNespresso.setRoastiness(Nes.getRoastiness());
			return this.repo.save(existingNespresso);
		} else {
			return null;
		}
	}

	// delete method
	public Nespresso deleteNespresso(Long id) {
		Optional<Nespresso> toDelete = this.repo.findById(id);
		this.repo.deleteById(id);
		return toDelete.orElse(null);
	}
}
