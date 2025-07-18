package com.trade.service;

import com.trade.model.Coin;
import com.trade.model.User;
import com.trade.model.Watchlist;
import com.trade.repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WatchlistServiceImpl implements WatchlistService{
    @Autowired
    private WatchlistRepository watchlistRepository;


    @Override
    public Watchlist findUserWatchlist(String userId) throws Exception {
        Watchlist watchlist=watchlistRepository.findByUserId(userId);
        if(watchlist==null){
            throw new Exception("watch not found");
        }
        return watchlist;
    }

    @Override
    public Watchlist createWatchList(User user) {
        Watchlist watchlist=new Watchlist();
        watchlist.setUser(user);
        return watchlistRepository.save(watchlist);
    }

    @Override
    public Watchlist findById(String id) throws Exception {
        Optional<Watchlist> optionalWatchlist = watchlistRepository.findById(id);
        if(optionalWatchlist.isEmpty()){
            throw new Exception("watch list not found");
        }
        return optionalWatchlist.get();
    }

    @Override
    public Coin addItemToWatchlist(Coin coin,User user) throws Exception {
        Watchlist watchlist=findUserWatchlist(user.getId());

        if(watchlist.getCoins().contains(coin)){
            watchlist.getCoins().remove(coin);
        }
        else watchlist.getCoins().add(coin);
        watchlistRepository.save(watchlist);
        return coin;
    }
}
