package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Com_User;
@Mapper
public interface Com_UserMapper {
	/**
	 * 前台登录
	 * @param user
	 * @return
	 */
    int loginReception(Com_User user);
}