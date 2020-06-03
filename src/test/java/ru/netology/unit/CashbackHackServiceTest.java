package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnBonusIfAmountMoreThan1000() {
        int amount = 1100;

        int actualDop = service.remain(amount);
        int expectedDop = 900;

        assertEquals (actualDop,expectedDop);
    }

    @Test
    void shouldReturnZeroIf1000() {
        int amount = 1000;

        int actualDop = service.remain(amount);
        int expectedDop = 0;

        assertEquals(actualDop, expectedDop);
    }

    @Test
    void shouldOfferBuySomethingForMaxBonus() {
        int amount = 900;

        int actualDop = service.remain(amount);
        int expectedDop = 100;

        assertEquals(actualDop, expectedDop);
    }


}