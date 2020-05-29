package ru.netology.unit;
import ru.netology.unit.CashbackHackService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldReturnBonusIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount =1100;

        int actual = service.calculateBonus(amount);
        int expected = amount/service.getBoundary()*service.getCashBack();

        assertEquals(expected, actual);
    }
@Test
    void shouldReturnMaxBonusIfAmountMoreThanMaximum() {
        CashbackHackService service = new CashbackHackService();
        int amount =10_500;

        int actual = service.calculateBonus(amount);
        int expected = service.getMaximumAmount()/service.getBoundary()*service.getCashBack();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroIfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldOfferBuySomethingForMaxBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.calculateBonus(amount);
        int expected =amount/service.getBoundary()*service.getCashBack();;

        assertEquals(expected, actual);
    }


}