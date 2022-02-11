package com.qa.Nespresso;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NespressoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void applicationContextTest() {
	    NespressoApplication.main(new String[]{});
	}
}
