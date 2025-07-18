package com.trade.controller;

import com.trade.exception.UserException;
import com.trade.model.Coin;
import com.trade.model.User;
import com.trade.model.Watchlist;
import com.trade.service.CoinService;
import com.trade.service.UserService;
import com.trade.service.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {
    private final WatchlistService watchlistService;
    private final UserService userService;

    @Autowired
    private CoinService coinService;

    @Autowired
    public WatchlistController(WatchlistService watchlistService,
                               UserService userService) {
        this.watchlistService = watchlistService;
        this.userService=userService;
    }

    @GetMapping("/user")
    public ResponseEntity<Watchlist> getUserWatchlist(
            @RequestHeader("Authorization") String jwt) throws Exception {

            User user=userService.findUserProfileByJwt(jwt);
            Watchlist watchlist = watchlistService.findUserWatchlist(user.getId());
            return ResponseEntity.ok(watchlist);

    }

    @PostMapping("/create")
    public ResponseEntity<Watchlist> createWatchlist(
            @RequestHeader("Authorization") String jwt) throws UserException {
        User user=userService.findUserProfileByJwt(jwt);
        Watchlist createdWatchlist = watchlistService.createWatchList(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWatchlist);
    }

    @GetMapping("/{watchlistId}")
    public ResponseEntity<Watchlist> getWatchlistById(
            @PathVariable String watchlistId) throws Exception {

            Watchlist watchlist = watchlistService.findById(watchlistId);
            return ResponseEntity.ok(watchlist);

    }

    @PatchMapping("/add/coin/{coinId}")
    public ResponseEntity<Coin> addItemToWatchlist(
            @RequestHeader("Authorization") String jwt,
            @PathVariable String coinId) throws Exception {


            User user=userService.findUserProfileByJwt(jwt);
            Coin coin=coinService.findById(coinId);
            Coin addedCoin = watchlistService.addItemToWatchlist(coin, user);
            return ResponseEntity.ok(addedCoin);

    }
}
