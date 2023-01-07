package com.hillel.hrebeniev.homeworks.homework_14;


public class Main {
    public static void main(String[] args) {
        Fitness account1 = new Fitness("Иван", "Иванов", 14, 12, 2008,
                "din@mail.ru", "38-067-777-8-300", 90, "120/80", 160);
        account1.printAccountInfo();
        System.out.println();

        Fitness account2 = new Fitness("Василий", "Петренко", 14, 10,
                2001, "vasyl@mail.ru", "38-067-360-8-320", 58.7, "130/70", 110);
        account2.printAccountInfo();
        System.out.println();
        account2.setSteps(210);
        account2.setWeight(55);
        account2.printAccountInfo();
        System.out.println();

        Fitness account3 = new Fitness("Иван", "Макаренко", 10, 10, 2003,
                "makar@mail.ru", "38-097-77-81-123", 55.9, "110/90", 1110);
        account3.printAccountInfo();
        System.out.println();

        Fitness account4 = new Fitness("Николай", "Штурко", 2, 8, 2005,
                "shtyrko@mail.ua", "38-066-153-81-77", 52.1, "110/95", 533);
        account4.printAccountInfo();
        System.out.println();
        account4.setSteps(887);
        account4.setSurname("Шарапов");
        account4.setPressure("120/85");
        account4.printAccountInfo();
    }

}
