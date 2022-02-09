package com.qa.Nespresso.controller;


import org.springframework.web.bind.annotation.RestController;

import com.qa.Nespresso.service.NespressoService;

@RestController
public class NespressoController {
	
	//declare my variables and constructor
	
	private NespressoService s;

	public NespressoController(NespressoService s) {
		this.s = s;
	}
	

	
}
	

