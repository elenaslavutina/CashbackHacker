package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    void shouldReturnBonusIfAmountMoreThan1000() {
        int amount = 1100;

        int actualDop = service.remain(amount);
        int expectedDop = 900;

        assertEquals(expectedDop, actualDop);
    }

    @Test
    void shouldReturnZeroIf1000() {
        int amount = 1000;

        int actualDop = service.remain(amount);
        int expectedDop = 0;

        assertEquals(expectedDop, actualDop);
    }

    @Test
    void shouldOfferBuySomethingForMaxBonus() {
        int amount = 900;

        int actualDop = service.remain(amount);
        int expectedDop = 100;
        ;

        assertEquals(expectedDop, actualDop);
    }
}