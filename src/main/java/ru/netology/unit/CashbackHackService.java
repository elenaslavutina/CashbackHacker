package ru.netology.unit;

public class CashbackHackService {
    private final int boundary = 1000;//минимальная нижняя граница начисления кэшбэка

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

      public int getBoundary() {
        return boundary;
    }
}
