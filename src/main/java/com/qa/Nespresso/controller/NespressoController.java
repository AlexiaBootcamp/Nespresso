package com.qa.Nespresso.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	//read by Id method from
	@GetMapping("/getByID/{id}")
	public Nespresso getByIdNespresso(@PathVariable Long id) {
		return this.s.getByIDNespresso(id);	
	}
	
	//read all method 
	@GetMapping("/getAll")
	public  List<Nespresso> getAll() {
	return this.s.readAllNespresso();
	}
	
   //update method 
	@PutMapping("/updateOne/{id}")
	public Nespresso updateNespresso(@PathVariable Long id, @RequestBody Nespresso Nes) {
		return this.s.updateNespresso(id, Nes);
	}
	

	//delete method 
	@DeleteMapping("/remove/{id}")
	public boolean deleteNespresso(@PathVariable Long id) {
		return this.s.deleteNespresso(id);
	}
	
}
	

