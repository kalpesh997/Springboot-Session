package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LoginRegDAO;
import com.example.model.LoginVO;

@Service
@Transactional
public class LoginRegImpl implements LoginRegService {

	@Autowired
	LoginRegDAO loginRegDAO;
	
	@Override
	public void insertUser(LoginVO loginVO) {
	
		this.loginRegDAO.save(loginVO);
	}

	@Override
	public LoginVO isAvailableUser(String email, String password) {
						
		return loginRegDAO.findByEmailAndPassword(email, password);
	}

}
