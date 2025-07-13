package com.trade.repository;

import com.trade.model.PaymentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentDetailsRepository extends MongoRepository<PaymentDetails,String> {

    PaymentDetails getPaymentDetailsByUserId(String userId);
}
