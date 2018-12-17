package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping("/login.action")
	@ResponseBody
	public String HellowWord(String name,String pass){
		if("admin".equals(name) && "123456".equals(pass)){
			return "{'name':"+name+",'pass':"+pass+",'result':'登录成功'}";
		}else{
			return "{'name':"+name+",'pass':"+pass+",'result':'登录失败'}";
		}
		
	}
}
