package com.wade.demo_aks.service;

import com.wade.demo_aks.entity.OrderTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    public List<OrderTest> findAllOrders() {
        return Arrays.asList(OrderTest.builder().id(12L).name("Order1").build());
    }
}
