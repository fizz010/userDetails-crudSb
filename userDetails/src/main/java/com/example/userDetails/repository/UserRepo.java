package com.example.userDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userDetails.userdto.UserD;

public interface UserRepo extends JpaRepository<UserD, Integer>{

}
