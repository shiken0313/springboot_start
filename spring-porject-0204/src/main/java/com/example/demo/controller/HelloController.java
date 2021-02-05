package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("hello")
	public String Hello() {
		
		Car car = new Car();
		car.setName("BMW");
		car.setPrice(1000);
		System.out.println(car);
		return "Hello World !";
	}
	
}
