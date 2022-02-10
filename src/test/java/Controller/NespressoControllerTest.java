package Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.Nespresso.domain.Nespresso;

@SpringBootTest
@AutoConfigureMockMvc //acts like your postman-makes the test requests
@Sql(scripts = {"classpath:nespresso-schema.sql","classpath:nespresso-data.sql"}, executionPhase = SqL.ExequtionPhase.BEFORE_TEST_METHOD)//prepopulation
@ActiveProfiles("test")
public class NespressoControllerTest {
	
	@Autowired
	private MockMvc mock;//to mock the requests
	
	@Autowired
	private ObjectMapper map;
	//interperts JSON
	
	@Test
	void TestCreateCont() throws Exception {
		//create a nespresso
		Nespresso newNes = new Nespresso("colombia","espresso",6,"woody","medium");
		//convert into JSON string
		String newCJSON = this.map.writeValueAsString(newNes);
		//build the mock request
		RequestBuilder mockRequest = post("/createNespresso").contentType(MediaType.APPLICATION_JSON).content(newCJSON);
		
		///-----response
		Nespresso savedC = new Nespresso(1L,"colombia","espresso",6,"woody","medium");
		///already inserted one record online
		//convert to JSON
		String savedCJSON = this.map.writeValueAsString(savedNes);
		
		//test response(status and body)
		//test status equals 201 created
		ResultMatcher matchStatus = status().isCreated();
		//test response body
		ResultMatcher matchBody = content().json(savedCJSON);
		
		
		//perform the test
		this.mock.perform(mockRequest).andExpect(matchStatus).andExpect(matchBody);
		
	}

}
