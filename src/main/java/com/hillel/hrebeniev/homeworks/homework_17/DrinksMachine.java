package com.hillel.hrebeniev.homeworks.homework_17;

import java.util.Arrays;
import java.util.Scanner;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    MINERAL("Минералка"),
    COLA("Кока-кола");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}

