package com.ecommerce.ecommerce.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class CustomerNotFoundException extends RuntimeException {
    private final String message;

}
