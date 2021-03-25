package com.demo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/abhishek")
	public String move() {
		return "vinay";
		
	}
	
	@RequestMapping(value="/bhagi",method = RequestMethod.POST)
	public String test() {
		return "callled test method";
	}

}
