package com.example.PaymentService.dtos;

import lombok.Data;

@Data
public class CreatePaymentLinkRequestDto {
    Long orderId;
    Long amount;
}
