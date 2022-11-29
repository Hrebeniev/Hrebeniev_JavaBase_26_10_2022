package com.hillel.hrebeniev.homeworks.homework_5;

public class Main {
    public static void main(String[] args) {
        int dynasty_li = 860;

        int warrior_li = 13 * dynasty_li;
        int archer_li = 24 * dynasty_li;
        int rider_li = 46 * dynasty_li;

        int dynasty_min = (int) (dynasty_li * 1.5);

        int warrior_min = 9 * dynasty_min;
        int archer_min = 35 * dynasty_min;
        int rider_min = 12 * dynasty_min;

        System.out.println("Загальна атака династії Лі: " + (warrior_li + archer_li + rider_li));
        System.out.println("Загальна атака династії Мінь: " + (warrior_min + archer_min + rider_min));


    }
}
