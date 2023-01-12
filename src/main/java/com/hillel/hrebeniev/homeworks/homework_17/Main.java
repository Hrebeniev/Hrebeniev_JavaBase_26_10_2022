package com.hillel.hrebeniev.homeworks.homework_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Здравствуйте! Сделайте свой заказ.");
            DrinkPreparing drinksMachine = new DrinkPreparing();
            drinksMachine.start();
            drinksMachine.process();
            System.out.println("До свидания!");
            break;
        }
    }
}