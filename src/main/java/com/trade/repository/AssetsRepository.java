package com.trade.repository;

import com.trade.model.Asset;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AssetsRepository extends MongoRepository<Asset,String> {
   public List<Asset> findByUserId(String userId);

   Asset findByUserIdAndCoinId(String userId, String coinId);

   Asset findByIdAndUserId(String assetId, String userId);

//   Optional<Assets> findByUserIdAndSymbolAndPortfolioId(Long userId,String symbol, Long portfolioId);
}
