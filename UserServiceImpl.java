package com.springsecurity.springsecurity.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.springsecurity.model.User;
import com.springsecurity.springsecurity.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	//@Autowired
    //private BCryptPasswordEncoder passEncode;
	
	@Override
	public Integer saveUser(User user) {
		 //user.setPassword(
				//passEncode.encode(user.getPassword())
				//);
		return repo.save(user).getId();
	}
	@Override
	public List<User> getDetails() {
		
		return repo.findAll();
	}
	

}
