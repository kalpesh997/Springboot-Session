package com.example.service;

import com.example.model.LoginVO;

public interface LoginRegService {

	public void insertUser(LoginVO loginVO);
	
	public LoginVO isAvailableUser(String email, String password);
}
