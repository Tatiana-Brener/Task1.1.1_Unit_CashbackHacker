package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateAmountOfAditionBuyIfBuyUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = 100;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountOfAditionBuyIfBuyAfter1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1450;
        int actual = 550;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountOfAditionBuyIfBuyEquales1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = 0;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }
}