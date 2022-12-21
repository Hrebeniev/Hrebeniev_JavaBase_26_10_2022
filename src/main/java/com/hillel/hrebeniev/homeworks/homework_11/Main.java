package com.hillel.hrebeniev.homeworks.homework_11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число M: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Повторите");
            scanner.next();
        }
        int M = scanner.nextInt();

        System.out.print("Введите целое число N: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Это не число! Повторите");
            scanner.next();
        }
        int N = scanner.nextInt();
        scanner.close();

        int[][] first = new int[M][N];
        int[][] second = new int[N][M];
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
