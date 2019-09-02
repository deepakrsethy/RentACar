package com.deepak.rentACar.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Assert;
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
public class WelcomeControllerTest {
	
	private WelcomeController controller;
		
	@Autowired
	private MockMvc mockMvc;
	
	@Before
	public void setUp(){
		controller = new WelcomeController();
	}
	
	/*@Ignore
	@Test
	public void testWelcome() throws Exception{
		mockMvc.perform(get("/rentACar/welcome")).andExpect(status().isOk());
	}*/
	
	
	@Test
	public void testWelcomeResult(){
		Assert.assertEquals("Welcome to Rent A Car", controller.welcome());
	}	
	
	@After
	public void cleanUp(){
		controller = null;
	}
}
