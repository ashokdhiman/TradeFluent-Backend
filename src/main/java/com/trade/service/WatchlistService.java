package com.trade.service;

import com.trade.model.Coin;
import com.trade.model.User;
import com.trade.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(String userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(String id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
