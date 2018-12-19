package com.example.entity;

import java.util.Map;

public class StatusCodeLogin {
	private int status;
	private String message;
	private Map<String,String> data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Map<String,String> getData() {
		return data;
	}
	public void setData(Map<String,String> data) {
		this.data = data;
	}
	
}
