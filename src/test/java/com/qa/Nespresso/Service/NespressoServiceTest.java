package com.qa.Nespresso.Service;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.Nespresso.domain.Nespresso;
import com.qa.Nespresso.repo.NespressoRepo;
import com.qa.Nespresso.service.NespressoService;

@SpringBootTest
public class NespressoServiceTest {
	
	@Autowired
	private NespressoService service;
	
	@MockBean
	private NespressoRepo repo;
	
	Nespresso newNes;
	Nespresso savedNes;
	
	@BeforeEach
	void setUp() {
		newNes = new Nespresso("roma","espresso",7,"fruity","dark");
		savedNes = new Nespresso(1L,"roma","espresso",7,"fruity","dark");
		
		//System.out.println ("before");	
	}

	@Test
	void testcreate() {
		//System.out.println("create");	
		//given
		//testing data
		
		//when
		Mockito.when(this.repo.save(newNes)).thenReturn(savedNes);
		//then
		assertThat(this.service.createNespresso(newNes)).isEqualTo(savedNes);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).save(newNes);
		
	}
	
	@Test
	void testread() {
		//System.out.println("create");	
		//given
		List<Nespresso> savedNes = new ArrayList<>();
		savedNes.add(new Nespresso("roma","espresso",7,"fruity","dark"));
		//testing data
		
		//when
		Mockito.when(this.repo.findAll()).thenReturn(savedNes);
		//then
		assertThat(this.service.readAllNespresso()).isEqualTo(savedNes);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		
	}
	
	@Test
	void testUpdate() {
		//given-id, object
		Long id = 1L;
		//new Nes to update
		Nespresso toUpdate = new Nespresso("roma","espresso",7,"fruity","dark");
		
		///System.out.println("update");		
	}
	
	@Test
	void testDelete() {
		//given-id, object
		Long id = 1L;
		//new Nes to update
		Nespresso toUpdate = new Nespresso("Roma","espresso",6,"fruity","dark");
		
		///System.out.println("update");		
	}
	
}

