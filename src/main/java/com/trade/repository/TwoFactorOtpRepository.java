package com.trade.repository;

import com.trade.model.TwoFactorOTP;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TwoFactorOtpRepository extends MongoRepository<TwoFactorOTP,String> {

    TwoFactorOTP findByUserId(String userId);
}
