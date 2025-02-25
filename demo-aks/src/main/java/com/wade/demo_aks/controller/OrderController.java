package com.wade.demo_aks.controller;

import com.wade.demo_aks.entity.OrderTest;
import com.wade.demo_aks.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public List<OrderTest> getAllOrders() {
        return orderService.findAllOrders();
    }

    @PostMapping("/order")
    public void helloPost(@RequestBody List<OrderTest> orderTests) {

    }
}
