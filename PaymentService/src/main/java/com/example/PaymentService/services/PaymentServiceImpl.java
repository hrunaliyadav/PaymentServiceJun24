package com.example.PaymentService.services;

import com.example.PaymentService.payment_gateways.PaymentGatewayAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    private PaymentGatewayAdapter paymentGatewayAdapter;

    @Autowired
    public PaymentServiceImpl(PaymentGatewayAdapter paymentGatewayAdapter) {
        this.paymentGatewayAdapter = paymentGatewayAdapter;
    }

    @Override
    public String createPaymentLink(long orderId, long amt) throws Exception {
        //To do call the order service and user service
        return paymentGatewayAdapter.createPaymentLink(orderId, amt);
    }
}
