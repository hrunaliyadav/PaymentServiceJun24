package com.example.PaymentService.controllers;

import com.example.PaymentService.dtos.CreatePaymentLinkRequestDto;
import com.example.PaymentService.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController  {
    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public ResponseEntity<String> createPaymentLink(@RequestBody CreatePaymentLinkRequestDto requestDto) throws Exception{
        try {
            String paymentLink = this.paymentService.createPaymentLink(requestDto.getOrderId(), requestDto.getAmount());
            return new ResponseEntity<>(paymentLink, HttpStatusCode.valueOf(200));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
