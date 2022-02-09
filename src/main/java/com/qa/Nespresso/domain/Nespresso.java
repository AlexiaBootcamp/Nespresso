package com.qa.Nespresso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nespresso {
	
	//declaring my variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
    private String name;
	@Column(nullable=false)
    private String type;
	@Column(nullable=false)
    private int intensity;
	@Column(nullable=false)
    private String aroma;
	@Column(nullable=false)
    private String roastiness;
	
	
	//Default constructor
	public Nespresso() {
		super();
	}

  //constructor with all variables except the id variable
	public Nespresso(String name, String type, int intensity, String aroma, String roastiness) {
		super();
		this.name = name;
		this.type = type;
		this.intensity = intensity;
		this.aroma = aroma;
		this.roastiness = roastiness;
	}

	  // constructor with all the variables
	public Nespresso(Long id, String name, String type, int intensity, String aroma, String roastiness) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.intensity = intensity;
		this.aroma = aroma;
		this.roastiness = roastiness;
	}
	
	
}
