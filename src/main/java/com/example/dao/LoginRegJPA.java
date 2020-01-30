package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.LoginVO;

@RepositoryRestResource(collectionResourceRel="users", path="users")
public interface LoginRegJPA extends PagingAndSortingRepository<LoginVO, Integer> { 

}