package com.example.coffeemanagement.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.util.Assert;


@ToString
@EqualsAndHashCode
@Getter
public class Email {

    private final String address;

    public Email(String address) {
        Assert.notNull(address, "address should not be null");
        Assert.isTrue(address.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"),
                "유효하지 않은 이메일 형식입니다.");
        this.address = address;
    }


}
