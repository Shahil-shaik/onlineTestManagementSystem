package com.cg.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.User;

@Transactional
@Repository

public class UserDaoImpl implements UserDaoI{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public User addUser(User u) {
		em.persist(u);
		return u;
	}

}
