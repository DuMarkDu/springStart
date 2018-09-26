package com.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {
	
	//@ResponseBody
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String myFirstController(){
		System.out.println("some one call MyFirstController");
		return "hello";
	}
	
	@ResponseBody
	@RequestMapping(value="/firstGet/{id}",method=RequestMethod.GET)
	public String myFirstGet(@PathVariable("id") String id){
		System.out.println("from page id:"+id);
		return "Right "+id;
	}
	
	@ResponseBody
	@RequestMapping(value="/firstPost",method=RequestMethod.POST)
	public String myFirstPost(@RequestBody String msg){
		System.out.println("from page msg:"+msg);
		return "Good "+msg;
	}
	
	
}
