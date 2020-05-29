package ru.netology.unit;

import jdk.internal.reflect.Reflection;

public class CashbackHackService {
    private final int boundary = 1000;//минимальная нижняя граница начисления кэшбэка
    private int cashBack = 10; //кэшбэк в рублях с каждой тысячи
    private int maximumAmount = 10_000;
    public int remain(int amount) {
        return boundary - amount % boundary;
    }


    public int calculateBonus(int amount) {

        if (remain(amount) <= 200) {
            System.out.println("May be you buy something else to " + remain(amount) + "rub to get max bonus");
        }
        int bonus = (amount / boundary) * cashBack;

        if (amount >= maximumAmount) {
            return (maximumAmount/boundary*cashBack);
        }
        return bonus;
    }

    public int getBoundary() {
        return boundary;
    }

    public int getCashBack() {
        return cashBack;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}

