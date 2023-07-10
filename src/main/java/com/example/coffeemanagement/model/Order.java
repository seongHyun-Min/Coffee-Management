package com.example.coffeemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class Order {
    private final UUID orderId;
    private final Email email;
    private String address;
    private String postcode;
    private final List<OrderItem> orderItems;
    private OrderStatus orderStatus;
    private final LocalDateTime createAt;
    private LocalDateTime updateAt;

    public void setAddress(String address) {
        this.address = address;
        this.updateAt = LocalDateTime.now();
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
        this.updateAt = LocalDateTime.now();
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        this.updateAt = LocalDateTime.now();
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
        this.updateAt = LocalDateTime.now();
    }
}
