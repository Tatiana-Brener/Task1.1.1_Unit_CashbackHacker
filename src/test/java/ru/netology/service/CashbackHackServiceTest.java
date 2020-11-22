package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateAmountOfAditionBuyIfBuyUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountOfAditionBuyIfBuyAfter1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1450;
        int actual = service.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAmountOfAditionBuyIfBuyEquales1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}