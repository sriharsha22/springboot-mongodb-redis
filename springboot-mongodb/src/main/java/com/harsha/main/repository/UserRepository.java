package com.harsha.main.repository;

import com.harsha.main.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by harsha on 8/8/17.
 */
public interface UserRepository extends MongoRepository<Users, Integer> {

	
}