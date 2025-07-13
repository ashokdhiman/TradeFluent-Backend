package com.trade.repository;

import com.trade.model.ForgotPasswordToken;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForgotPasswordRepository extends MongoRepository<ForgotPasswordToken,String> {
    ForgotPasswordToken findByUserId(String userId);
}
