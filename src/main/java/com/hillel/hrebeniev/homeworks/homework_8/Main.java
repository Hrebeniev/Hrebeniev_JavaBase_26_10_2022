package com.hillel.hrebeniev.homeworks.homework_8;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != 4 && j != 4)
                    System.out.println("Шаттл " + i + "" + j);
            }
        }
    }
}

