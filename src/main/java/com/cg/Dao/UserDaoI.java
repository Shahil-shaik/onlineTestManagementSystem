package com.cg.Dao;

import org.springframework.stereotype.Repository;

import com.cg.Entity.User;

@Repository
public interface UserDaoI {
	public User addUser(User u);
}
