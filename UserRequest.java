package com.springsecurity.springsecurity.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class UserRequest
{
	private String usename;
	private String password;
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
