package com.trade.repository;

import com.trade.model.Watchlist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WatchlistRepository extends MongoRepository<Watchlist,String> {

    Watchlist findByUserId(String userId);

}
