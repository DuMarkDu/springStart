package com.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	//@ResponseBody
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String MyFirstController(){
		System.out.println("some one call MyFirstController");
		return "hello";
	}
}
