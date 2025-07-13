package com.trade.repository;

import com.trade.model.PaymentOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentOrderRepository extends MongoRepository<PaymentOrder,String> {
}
