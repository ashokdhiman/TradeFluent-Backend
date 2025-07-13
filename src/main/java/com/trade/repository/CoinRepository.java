package com.trade.repository;

import com.trade.model.Coin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoinRepository extends MongoRepository<Coin,String> {
}
