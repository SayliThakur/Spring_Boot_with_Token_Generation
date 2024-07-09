package com.springsecurity.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Integer>

{

}
