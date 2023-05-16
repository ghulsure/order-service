package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/order-service/api")
    public String getValues() {
        return "Getting Called by order service";
    }

    @GetMapping("/order-product")
    public String callService1() {
        String val = restTemplate.getForObject("http://product-service:8080/product-service/api", String.class);
        return "Service call from order to product --- " + val;
    }
}
