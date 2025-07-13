package com.trade.repository;

import com.trade.model.VerificationCode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VerificationRepository extends MongoRepository<VerificationCode,String> {
    VerificationCode findByUserId(String userId);
}
