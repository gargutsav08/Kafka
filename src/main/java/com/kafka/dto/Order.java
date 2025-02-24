package com.kafka.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="orders")
public class Order {
    @Id
    private int id;
    private String name;
    private int qty;
    private int price;
}
