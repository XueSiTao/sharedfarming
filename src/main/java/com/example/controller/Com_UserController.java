package com.example.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Com_User;
import com.example.entity.StatusCodeLogin;
import com.example.service.Com_UserService;
import com.example.util.GainOpenid;
import com.example.util.GainToken;

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
	public StatusCodeLogin HellowWord(String bindKeyInput1,String bindKeyInput2,String code){
		Com_User user= new Com_User();
		user.setLoginname(bindKeyInput1);
		user.setLoginpass(bindKeyInput2);
	
		int cou=userService.loginReception(user);
		
		StatusCodeLogin statuscode=new StatusCodeLogin();
		
		String openid= GainOpenid.getopen(code);
		
		System.out.println("openid:"+openid);
		
		if(cou>0){
			String token=GainToken.genToken();
			
			statuscode.setMessage("登录成功");
			statuscode.setStatus(200);
			Map<String,String> data=new HashMap<>();
			data.put("token",token);
			statuscode.setData(data);
			
			return statuscode;
		}else{
			statuscode.setMessage("登录失败");
			statuscode.setStatus(200);
			Map<String,String> data=new HashMap<>();
			data.put("token","");
			statuscode.setData(data);
			return statuscode;
		}
		
	}
	

}
