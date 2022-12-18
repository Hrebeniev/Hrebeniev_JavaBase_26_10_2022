package com.hillel.hrebeniev.homeworks.homework_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] first = new int[7];
        int[] second = new int[7];
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 10);
            second[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массивы до сортировки:");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println();
        System.out.println("Массивы после сортировки:");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println();

        int match = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                match++;
            }
        }
        int newMatch = 0;
        int[] arr = new int[match];
        if (match > 0) {
            for (int i = 0; i < first.length; i++) {
                if (first[i] == second[i]) {
                    arr[newMatch] = i;
                    newMatch++;
                }
            }
        }
        if (match > 0) {
            System.out.println("Количество совпадений: " + match);
            System.out.println("Совпали индексы: " + Arrays.toString(arr));
        } else {
            System.out.println("Совпадений нет");
        }
    }
}
