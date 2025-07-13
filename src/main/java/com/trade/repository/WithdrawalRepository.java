package com.trade.repository;

import com.trade.model.Withdrawal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WithdrawalRepository extends MongoRepository<Withdrawal,String> {
    List<Withdrawal> findByUserId(String userId);
}
