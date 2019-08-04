package com.springstart.controller;

import com.springstart.model.Login;
import com.springstart.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;


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
	public String myFirstPost(String user,Integer age){
		System.out.println("from page user:"+user);
		System.out.println("from page age:"+age);
		return "Good";
	}

	@ResponseBody
	@RequestMapping(value="/firstPost2",method=RequestMethod.POST)
	public String myFirstPost2(@RequestBody String msg){
		System.out.println("from page user:"+msg);
		return "Good";
	}

	@ResponseBody
	@RequestMapping(value="/firstPostForm",method=RequestMethod.POST)
	public String myFirstPost3(HttpServletRequest request){
		System.out.println("from page login,name:"+request.getParameter("name"));
		return "Good";
	}

	@ResponseBody
	@RequestMapping(value="/firstPostFormObj",method=RequestMethod.POST)
	public String myFirstPost4(@RequestBody String name){
		System.out.println("from page login,name:"+name);
		return "Good";
	}

	
}
