package com.hillel.hrebeniev.homeworks.homework_14;

class Fitness {
    private String name;
    private int dayOfBirthday;
    private int monthOfBirthday;
    private int yearOfBirthday;
    private String email;
    private String phone;
    private String surname;
    private double weight;
    private String pressure;

    private int steps;
    private int age;

    public String getName() {
        return name;
    }

    public int getDayOfBirthday() {
        return dayOfBirthday;
    }

    public int getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public int getAge() {
        age = 2020 - yearOfBirthday;
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Fitness(String name, String surname, int dayOfBirthday, int monthOfBirthday, int yearOfBirthday, String email,
                   String phone, double weight, String pressure, int steps) {
        this.name = name;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println("Пользователь: " + getName() + " " + surname);
        System.out.println("Дата Рождения: " + getDayOfBirthday() + "." + getMonthOfBirthday() + "."
                + getYearOfBirthday() + " (" + getAge() + " лет)");
        System.out.println("Email: " + getEmail());
        System.out.println("Телефон: " + getPhone());
        System.out.println("Вес: " + weight);
        System.out.println("Давление: " + pressure);
        System.out.println("Пройдено шагов: " + steps);
    }
}
