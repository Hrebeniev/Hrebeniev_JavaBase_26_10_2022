package com.hillel.hrebeniev.homeworks.homework_13;


public class Burger {
    String bread;
    String meat;
    String cheese;
    String green;
    String mayonnaise;
    String twice;

    public Burger(String bread, String meat, String cheese, String green, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;

        System.out.println("Стандартный Бургер");
        System.out.println("Ингридиенты: " + bread + ", " + meat + ", " + cheese + ", " + green + ", " + mayonnaise);
    }

    public Burger(String bread, String meat, String cheese, String green) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;

        System.out.println("Диетический Бургер");
        System.out.println("Ингридиенты: " + bread + ", " + meat + ", " + cheese + ", " + green);
    }

    public Burger(String bread, String twice, String meat, String cheese, String green, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        this.twice = twice;

        System.out.println("Бургер с двойным мясом");
        System.out.println("Ингридиенты: " + bread + ", " + twice + " " + meat + ", " + cheese + ", " + green + ", "
                + mayonnaise);
    }
}