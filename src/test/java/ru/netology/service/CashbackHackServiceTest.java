package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldCalculateCashbackHack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 400;
        int expected = 600;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotCalculateCashbackHack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int expected = 201;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldBeZeroCalculateCashbackHack() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected,actual);
    }
}