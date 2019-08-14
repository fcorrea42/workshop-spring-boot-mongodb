package com.fcorrea42.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fcorrea42.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
