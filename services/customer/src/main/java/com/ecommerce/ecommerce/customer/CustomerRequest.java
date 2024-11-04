package com.ecommerce.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "CUSTOMER FIRSTNAME IS REQUIRED")
        String firstName,
        @NotNull(message = "CUSTOMER LASTNAME IS REQUIRED")
        String lastName,
        @Email(message = "CUSTOMER EMAIL IS NOT VALID")
        String email,
        Address address) {


}
