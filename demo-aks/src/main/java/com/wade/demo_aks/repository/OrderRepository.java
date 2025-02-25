package com.wade.demo_aks.repository;

import com.wade.demo_aks.entity.OrderTest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<OrderTest, Long> {

}
