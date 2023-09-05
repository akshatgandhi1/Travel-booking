package com.einfo.userservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.einfo.userservice.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByUseremail(String username);

	
	
}
