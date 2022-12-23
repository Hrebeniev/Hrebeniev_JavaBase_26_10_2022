package com.hillel.hrebeniev.homeworks.homework_11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число M: ");
        boolean isReady = false;
        int m = 0;
        while (!isReady) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                m = scanner.nextInt();
                if (m < 0) {
                    System.out.println("Это число меньше 0! Повторите!");
                    scanner = new Scanner(System.in);
                } else {
                    isReady = true;
                }
            } else {
                System.out.println("Это не число! Повторите!");
                scanner = new Scanner(System.in);
            }
        }

        System.out.print("Введите целое число N: ");
        isReady = false;
        int n = 0;
        while (!isReady) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Это число меньше 0! Повторите!");
                    scanner = new Scanner(System.in);
                } else {
                    isReady = true;
                }
            } else {
                System.out.println("Это не число! Повторите!");
                scanner = new Scanner(System.in);
            }
        }
        scanner.close();


        int[][] first = new int[m][n];
        int[][] second = new int[n][m];
        System.out.println();
        System.out.println("Before: ");
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                first[i][j] = (int) (Math.random() * 9);

                System.out.print(first[i][j] + "\t");
                second[j][i] = first[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After: ");
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
                System.out.print(second[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
