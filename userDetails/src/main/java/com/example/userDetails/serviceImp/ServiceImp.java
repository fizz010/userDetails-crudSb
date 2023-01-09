package com.example.userDetails.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userDetails.repository.UserRepo;
import com.example.userDetails.service.ServeUser;
import com.example.userDetails.userdto.UserD;


@Service
public class ServiceImp implements ServeUser {
	@Autowired
	private UserRepo userrepo;

	@Override
	public UserD save(UserD userd) {
		
		return userrepo.save(userd);
	}

	@Override
	public void delete1(int id) {
		
		userrepo.deleteById(id);
		
	}

	@Override
	public List<UserD> getAll() {
		
		return userrepo.findAll();
	}


	

}
