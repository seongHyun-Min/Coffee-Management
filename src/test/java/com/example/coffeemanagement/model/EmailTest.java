package com.example.coffeemanagement.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    public void testValidEmail() {
        //given
        String validAddress = "steve6133@naver.com";

        //when
        Email email = new Email(validAddress);

        //then
        Assertions.assertEquals(validAddress, email.getAddress());
    }

    @Test
    public void testNullEmail() {
        //when
        String nullAddress = null;

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(nullAddress));
    }

    @Test
    public void testInvalidEmail() {
        //when
        String InvalidAddress = "steve_naver.com";

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(InvalidAddress));
    }
}