package ru.netology.unit;

import jdk.internal.reflect.Reflection;

public class CashbackHackService {
    private final int boundary = 1000;//минимальная нижняя граница начисления кэшбэка

    public int remain(int amount) {
        if (amount % boundary == 0) return 0;
        if ((boundary - amount % boundary) == 100)
            System.out.println("Suggest you buy something to 100rub for max bonus");
        return boundary - amount % boundary;
    }


    public int getBoundary() {
        return boundary;
    }


}

