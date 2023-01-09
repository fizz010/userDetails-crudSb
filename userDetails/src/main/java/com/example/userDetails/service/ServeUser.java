package com.example.userDetails.service;

import java.util.List;

import com.example.userDetails.userdto.UserD;



public interface ServeUser {
	UserD save(UserD userd);
	
	void delete1(int id);
	
	List<UserD> getAll();
}
