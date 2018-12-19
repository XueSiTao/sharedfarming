package com.example.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.dao.Com_UserMapper;
import com.example.entity.Com_User;
import com.example.service.Com_UserService;

@Service("Com_UserService")
public class Com_UserServiceImpl implements Com_UserService {

	@Resource
	private Com_UserMapper mapper;
	
	@Override
	public int loginReception(Com_User user) {
		// TODO Auto-generated method stub
		return mapper.loginReception(user);
	}

}
