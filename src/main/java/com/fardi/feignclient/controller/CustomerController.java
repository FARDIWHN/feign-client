package com.fardi.feignclient.controller;

import com.fardi.feignclient.bean.Customer;
import com.fardi.feignclient.consumers.CustomerConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerConsumer customerConsumer;

    @GetMapping("")
    public Map<String,String> customerMS() {
        return customerConsumer.customerMS();
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerConsumer.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String id) {
        return customerConsumer.getCustomerById(id);
    }

    @PostMapping("")
    public ResponseEntity saveCustomer(@RequestBody Customer customer) {
        return customerConsumer.saveCustomer(customer);
    }

    @PutMapping("")
    public ResponseEntity updateCustomer(@RequestBody Customer customer) {
        return customerConsumer.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable("id") String id) {
        return customerConsumer.deleteCustomer(id);
    }



}
