package com.qa.Nespresso.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Nespresso.domain.Nespresso;
import com.qa.Nespresso.service.NespressoService;

@RestController
public class NespressoController {
	
	//declare my variables and constructor
	
	private NespressoService s;

	public NespressoController(NespressoService s) {
		this.s = s;
	}
	
   // create method 
	@PostMapping("/create")
	//passing a record with all thevalues//mapping the create method to the service class
	public Nespresso createNespresso(@RequestBody Nespresso Nes) {
		 return this.s.createNespresso(Nes);
	}
}
	

