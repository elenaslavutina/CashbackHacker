package ru.netology.unit;

import jdk.internal.reflect.Reflection;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

    public int getBoundary() {
        return boundary;
    }


}

