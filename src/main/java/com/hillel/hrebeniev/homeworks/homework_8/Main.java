package com.hillel.hrebeniev.homeworks.homework_8;

import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {

        int i = 1;
        int ii = 1;
        while (i > 0 && ii <= 100) {
            int first = i / 100;
            int second = i / 10 - first * 10;
            int third = i - first * 100 - second * 10;
            if (first != 4 && second != 4 && third != 4 && first != 9 && second != 9 && third != 9) {
                System.out.println("Шаттл " + i);
                ii++;
            }
            i++;
        }
    }
}

