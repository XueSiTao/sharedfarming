package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Com_User;
import com.example.service.Com_UserService;

@Controller
@RequestMapping("/")
public class Com_UserController {

	@Autowired
	private static Com_UserService userService;
	
	
	@RequestMapping("/login")
	@ResponseBody
	public String HellowWord(String bindKeyInput1,String bindKeyInput2){
		Com_User user= new Com_User();
		user.setLoginname(bindKeyInput1);
		user.setLoginpass(bindKeyInput2);
		userService.loginReception(user);
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Com_User user= new Com_User();
		user.setLoginname("admin");
		user.setLoginpass("admin");
		int cou=userService.loginReception(user);
		System.err.println(cou);
	}
}
