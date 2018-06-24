package com.tamil.iot.apiui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.iot.apiui.entity.MyEntity;

@RestController
public class MyController {

	@RequestMapping("/greeting")
	public MyEntity getAll() {
		return new MyEntity("firstName", "lastName");
	}

}
