package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService cashbackHackService  = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain (amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}