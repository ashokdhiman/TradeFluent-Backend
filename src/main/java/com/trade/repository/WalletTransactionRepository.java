package com.trade.repository;

import com.trade.model.Wallet;
import com.trade.model.WalletTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WalletTransactionRepository extends MongoRepository<WalletTransaction,String> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
