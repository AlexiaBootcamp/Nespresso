package com.qa.Nespresso.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NespressoTest {
	
	@Test
	public void hashTest() {
		Nespresso coffee1 = new Nespresso(1L,"colombia","espresso",6,"woody","medium");
		Nespresso coffee2 = new Nespresso(1L,"colombia","espresso",6,"woody","medium");
		
		assertThat(coffee1.hashCode()).isEqualTo(coffee2.hashCode());
	}
}
