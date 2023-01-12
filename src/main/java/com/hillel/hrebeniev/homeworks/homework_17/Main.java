package com.hillel.hrebeniev.homeworks.homework_17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
        System.out.println("count license: " + DrinkPreparing.getCounter());
    }

        public static void runApp() {

            Scanner scanner = new Scanner(System.in);

            DrinksMachine[] drinkTypes = DrinksMachine.values();

            DrinksMachine userDrinkType = null;
            System.out.println("count license: " + DrinkPreparing.getCounter());

            while (true) {
                System.out.println("Please enter drink type from list: " + Arrays.toString(drinkTypes));
                String userValue = scanner.nextLine();
                userValue = userValue.toUpperCase();


                for (DrinksMachine drinkType : drinkTypes) {
                    if (drinkType.toString().equals(userValue)) {
                        userDrinkType = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }

                if (userDrinkType != null) {
                    break;
                }
            }


            switch (userDrinkType) {
                case COFFEE: {
                    new DrinkPreparing();
                    System.out.println("Возьмите Ваш " + DrinksMachine.COFFEE.getTitle());
                    break;
                }

                case TEA: {
                    new DrinkPreparing();
                    System.out.println("Возьмите Ваш " + DrinksMachine.TEA.getTitle());
                    break;
                }

                case LEMONADE: {
                    new DrinkPreparing();
                    System.out.println("Возьмите Ваш " + DrinksMachine.LEMONADE.getTitle());
                    break;
                }

                case MOJITO: {
                    new DrinkPreparing();
                    System.out.println("Возьмите Ваш " + DrinksMachine.MOJITO.getTitle());
                    break;
                }
                case MINERAL: {
                    new DrinkPreparing();
                    System.out.println("Возьмите Ваш " + DrinksMachine.MINERAL.getTitle());
                    break;
                }
                case COLA: {
                    new DrinkPreparing();
                    System.out.println("Возьмите Ваш " + DrinksMachine.COLA.getTitle());
                    break;
                }

            }
    }
}
