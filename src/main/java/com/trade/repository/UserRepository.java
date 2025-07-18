package com.trade.repository;



import com.trade.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
	public User findByEmail(String email);
}
