package com.hillel.hrebeniev.homeworks.homework__17;

public enum DrinksMachine {
    COFFEE("Кофе", Drinks.COFFEE),
    TEA("Чай", Drinks.TEA),
    LEMONADE("Лимонад", Drinks.LEMONADE),
    MOJITO("Мохито", Drinks.MOJITO),
    MINERAL("Минералка", Drinks.MINERAL),
    COLA("Кока-кола", Drinks.COLA);

    private final String title;
    private final double cost;

    private DrinksMachine(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

}