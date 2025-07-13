package com.trade.service;

import com.trade.domain.OrderType;
import com.trade.model.Coin;
import com.trade.model.Order;
import com.trade.model.OrderItem;
import com.trade.model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(String orderId);

    List<Order> getAllOrdersForUser(String userId, String orderType, String assetSymbol);

    void cancelOrder(String orderId);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

}
