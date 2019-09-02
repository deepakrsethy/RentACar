package com.deepak.rentACar.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SearchCarControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	private SearchCarController controller;
	
	@Before
	public void setUp(){
		controller = new SearchCarController();
	}
	
	@Test
	public void testSearchURI() throws Exception{
		mockMvc.perform(get("rentACar/search/Pune")).andExpect(status().isOk());
	}
	
	@After
	public void cleanUp(){
		controller = null;
	}
}
