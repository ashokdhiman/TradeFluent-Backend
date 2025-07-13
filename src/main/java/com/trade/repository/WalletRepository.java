package com.trade.repository;

import com.trade.model.Wallet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletRepository extends MongoRepository<Wallet,String> {

    public Wallet findByUserId(String userId);


}
