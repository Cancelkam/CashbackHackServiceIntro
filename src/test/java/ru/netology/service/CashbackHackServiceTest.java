package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainFrom1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remainFrom1900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void remainFrom2500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void remainFromMinus100() throws IllegalArgumentException {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -100;
        try {
            cashbackHackService.remain(amount);
        } catch (IllegalArgumentException thrown) {
            assertEquals("amount must be greater than zero", thrown.getMessage());
        }
    }
}