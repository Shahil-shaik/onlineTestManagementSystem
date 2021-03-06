package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.Dao.QuestionDaoI;
import com.cg.Dao.UserDaoI;
import com.cg.Entity.User;

@SpringBootApplication
public class OnlineTestApplication implements CommandLineRunner{

	@Autowired
	UserDaoI userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User obj = new User(11615915,"shahil","12345",true,null);
		userDao.addUser(obj);
		System.out.println("done");
	}

}
