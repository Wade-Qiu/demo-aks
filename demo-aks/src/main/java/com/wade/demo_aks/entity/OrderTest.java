package com.wade.demo_aks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
public class OrderTest {
    @Id
    private Long id;
    private String name;
    private Date date;
}
