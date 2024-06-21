package com.example.PaymentService.payment_gateways;

import com.razorpay.RazorpayException;

public interface PaymentGatewayAdapter {
    public String createPaymentLink(long orderId, long amt) throws Exception;

}
