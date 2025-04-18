package com.ecommerce.order.payment;

import com.ecommerce.order.customer.CustomerResponse;
import com.ecommerce.order.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
