package com.springsecurity.springsecurity.service;

import java.util.List;

import com.springsecurity.springsecurity.model.User;


public interface IUserService 
{
       Integer saveUser(User user);
      public  List<User> getDetails();
}
