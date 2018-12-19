package com.example.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Com_User;
import com.example.service.Com_UserService;

@Controller
@RequestMapping("/")
public class Com_UserController {

	@Resource
	private Com_UserService userService;
	
	@RequestMapping("/")
	@ResponseBody
	public String ll(){
		
		return "可以访问!";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String HellowWord(String bindKeyInput1,String bindKeyInput2){
		Com_User user= new Com_User();
		user.setLoginname(bindKeyInput1);
		user.setLoginpass(bindKeyInput2);
	
		int cou=userService.loginReception(user);
		if(cou>0){
			return "登录成功!";
		}else{
			return "登录失败!";
		}
		
	}
	

}
