package com.tamil.iot.apiui;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tamil.iot.apiui.controller.MyController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private MyController controller;

	@Test
	public void assertContextLoad() throws Exception {
	}

	@Test
	public void assertControllerBeanLoad() throws Exception {
		assertThat(controller).isNotNull();
	}

}
