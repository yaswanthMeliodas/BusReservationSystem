package com.cg.app.repositories;


import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cg.app.model.IUser;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<IUser, Integer> {
	
	public IUser findByUserId(Integer userId);

}
