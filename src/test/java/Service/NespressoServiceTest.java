package Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.Nespresso.repo.NespressoRepo;
import com.qa.Nespresso.service.NespressoService;

@SpringBootTest
public class NespressoServiceTest {
	
	@Autowired
	private NespressoService service;
	
	@MockBean
	private NespressoRepo repo;
	
	@BeforeEach
	void setUp() {
		newNes = newNespresso("roma","espresso",7,"fruity","dark");
		savedNes = newNespresso(1L,"roma","espresso",7,"fruity","dark");
		
		//System.out.println ("before");	
	}

	@Test
	void testcreate() {
		//System.out.println("create");	
		//given
		//testing data
		
		//when
		Mockito.when(this.repo.save(newNes).thenReturn(savedNes);
		//then
		assertThat(this.service.create(newNes)).isEqualTo(savedNes);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).save(newNes);
		
	}
	
	
}
