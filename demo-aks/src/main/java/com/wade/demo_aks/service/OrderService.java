package com.wade.demo_aks.service;

import com.wade.demo_aks.entity.OrderTest;
import com.wade.demo_aks.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<OrderTest> findAllOrders() {
        return orderRepository.findAll();
    }
}
