package com.tamil.iot.apiui.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)
public class MyControllerTest {

	@Autowired
	private MockMvc mvc;

//    @MockBean
//    private EmployeeService service;

	@Test
	public void givenEmployees_whenGetEmployees_thenReturnJsonArray() throws Exception {
		mvc.perform(get("/greeting")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
//				.andExpect(jsonPath("$",hasSize(1)))
				.andExpect(jsonPath("$.firstName",is("firstName")))
				.andExpect(jsonPath("$.lastName",is("lastName")));
		
	}

}
