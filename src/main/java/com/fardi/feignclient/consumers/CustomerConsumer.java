package com.fardi.feignclient.consumers;

import com.fardi.feignclient.bean.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "customer-ms", url = "localhost:8081/customers")
public interface CustomerConsumer {

    @GetMapping("")
    public Map<String,String> customerMS() ;

    @GetMapping("/all")
    public List<Customer> getAllCustomers();

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String id) ;

    @PostMapping("")
    public ResponseEntity saveCustomer(@RequestBody Customer customer);

    @PutMapping("")
    public ResponseEntity updateCustomer(@RequestBody Customer customer) ;


    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable("id") String id) ;

}
