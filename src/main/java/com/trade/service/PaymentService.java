package com.trade.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.trade.domain.PaymentMethod;
import com.trade.model.PaymentOrder;
import com.trade.model.User;
import com.trade.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(String id) throws Exception;

    Boolean ProceedPaymentOrder(PaymentOrder paymentOrder,
                                String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              String orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            String orderId) throws StripeException;
}
