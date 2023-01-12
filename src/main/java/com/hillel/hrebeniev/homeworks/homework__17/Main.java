package com.hillel.hrebeniev.homeworks.homework__17;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Здравствуйте! Сделайте свой заказ.");
            DrinkPreparing drinksMachine = new DrinkPreparing();
            drinksMachine.start();
            drinksMachine.process();
            System.out.println("Спасибо за заказ!");
            break;
        }
    }
}