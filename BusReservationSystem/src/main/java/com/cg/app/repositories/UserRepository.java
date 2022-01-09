package com.cg.app.repositories;


import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cg.app.model.User;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Integer> {
	
	public User findByUserId(Integer userId);

}
