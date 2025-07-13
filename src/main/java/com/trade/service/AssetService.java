package com.trade.service;



import com.trade.model.Asset;
import com.trade.model.Coin;
import com.trade.model.User;

import java.util.List;

public interface AssetService {
    Asset createAsset(User user, Coin coin, double quantity);

    Asset getAssetById(String assetId);

    Asset getAssetByUserAndId(String userId,String assetId);

    List<Asset> getUsersAssets(String userId);

    Asset updateAsset(String assetId,double quantity) throws Exception;

    Asset findAssetByUserIdAndCoinId(String userId,String coinId) throws Exception;

    void deleteAsset(String assetId);


}
