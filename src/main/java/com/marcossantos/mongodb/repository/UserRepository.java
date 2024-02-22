package com.marcossantos.mongodb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcossantos.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
