package com.ecommerce.ecommerce.customer;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.hibernate.validator.constraintvalidators.RegexpURLValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private CustomerService customerService;


    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(customerService.createCustomer(request));

    }

    @PutMapping
    public ResponseEntity<?> updateCustomer(@RequestBody @Valid CustomerRequest request) {
        customerService.updateCustomer(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<CustomerResponse>> getCustomers() {
        return ResponseEntity.ok(customerService.findAllCustomers());
    }

    @GetMapping("/exists/{customer_id}")
    public ResponseEntity<Boolean> existsById(@PathVariable String customer_id) {
        return ResponseEntity.ok(customerService.existsById(customer_id));
    }

    @GetMapping("/{customer_id}")
    public ResponseEntity<CustomerResponse> findCustomerById(@PathVariable String customer_id) {
        return ResponseEntity.ok(customerService.findCustomerById(customer_id));
    }

    @DeleteMapping("/{customer_id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String customer_id) {
        customerService.deleteCustomer(customer_id);
        return ResponseEntity.ok().build();

    }
}
