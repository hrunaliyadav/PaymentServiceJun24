package com.example.PaymentService.services;

public interface PaymentService {

    public String createPaymentLink(long orderId, long amt) throws Exception;
}
