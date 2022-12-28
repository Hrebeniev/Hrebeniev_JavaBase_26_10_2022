package com.hillel.hrebeniev.homeworks.homework_13;
//import static com.hillel.hrebeniev.homeworks.homework_13.Burger;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burgerNormal = new Burger("Булочка", "Мясо", "Сыр", "Зелень",
                "Майонез");
        System.out.println();
        Burger burgerDiet = new Burger("Булочка", "Мясо", "Сыр", "Зелень");
        System.out.println();
        Burger burgerTwiceMeat = new Burger("Булочка", "Двойное", "Мясо", "Сыр", "Зелень",
                "Майонез");
    }
}
