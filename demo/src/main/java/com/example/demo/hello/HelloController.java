package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//First Rest Controller
@RestController
public class HelloController {
	
	//Output is simply saying hi
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

}
