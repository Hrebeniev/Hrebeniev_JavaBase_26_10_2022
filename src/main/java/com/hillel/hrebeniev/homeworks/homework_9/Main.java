package com.hillel.hrebeniev.homeworks.homework_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 40;
        int min = 18;
        int arr1[] = new int[25];
        int sum1 = 0;
        int arr2[] = new int[25];
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (max - min)) + min;
            sum1 = sum1 + arr1[i];
            arr2[i] = (int) (Math.random() * (max - min)) + min;
            sum2 = sum2 + arr2[i];
        }
        System.out.println("Команда 1 - " + Arrays.toString(arr1));
        System.out.println("Команда 2 - " + Arrays.toString(arr2));
        System.out.println("Средний возраст команды 1 - " + sum1 / arr1.length);
        System.out.println("Средний возраст команды 2 - " + sum2 / arr2.length);
    }
}
