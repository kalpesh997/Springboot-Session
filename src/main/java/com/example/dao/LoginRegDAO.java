package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.LoginVO;

@Repository
public interface LoginRegDAO extends CrudRepository<LoginVO, Integer> {

	/* @Query("from LoginVO where email=?1 and password=?2") */
	
	LoginVO findByEmailAndPassword(String email,String password); 
}
