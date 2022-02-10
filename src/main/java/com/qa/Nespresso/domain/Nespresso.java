package com.qa.Nespresso.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

	//added the getter and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public String getRoastiness() {
		return roastiness;
	}

	public void setRoastiness(String roastiness) {
		this.roastiness = roastiness;
	}
 
	//added hasCode and equal
	@Override
	public int hashCode() {
		return Objects.hash(aroma, id, intensity, name, roastiness, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nespresso other = (Nespresso) obj;
		return Objects.equals(aroma, other.aroma) && Objects.equals(id, other.id) && intensity == other.intensity
				&& Objects.equals(name, other.name) && Objects.equals(roastiness, other.roastiness)
				&& Objects.equals(type, other.type);
	}
	
	
}
