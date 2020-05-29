package ru.netology.unit;

import ru.netology.unit.CashbackHackService;
//import org.testng.annotations.Test;
//import org.testng.Assert;
import org.junit.Test;
import org.junit.Assert;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnBonusIfAmountMoreThan1000() {

        int amount = 1100;
        int actual = service.calculateBonus(amount);
        int expected = amount / service.getBoundary() * service.getCashBack();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnMaxBonusIfAmountMoreThanMaximum() {

        int amount = 10_500;
        int actual = service.calculateBonus(amount);
        int expected = service.getMaximumAmount() / service.getBoundary() * service.getCashBack();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroIfAmountLowerThan1000() {

        int amount = 600;
        int actual = service.calculateBonus(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldOfferBuySomethingForMaxBonus() {

        int amount = 1900;
        int actual = service.calculateBonus(amount);
        int expected = amount / service.getBoundary() * service.getCashBack();
         Assert.assertEquals(actual, expected);
    }

}