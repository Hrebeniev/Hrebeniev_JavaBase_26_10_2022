package com.hillel.hrebeniev.homeworks.homework_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberMember = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Испытайте удачу :)");
        System.out.println("Введите число от 0 до 10: ");

        int counter = 0;
        int number = 0;

        while (counter < 3) {
            System.out.println("Попытка №" + (counter + 1));
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();

                if ((number <= 10) && (number >= 0)) {
                    if (numberMember == number) {
                        System.out.println("Ты Победил!!!");
                        break;
                    }
                    counter++;
                } else {
                    System.out.println("Число должно быть от 0 до 10!");
                }
            } else {
                System.out.println("Хочешь обмануть меня, хитрец? :)");
                scanner = new Scanner(System.in);
            }

        }
        scanner.close();
        if (counter == 3) {
            System.out.println("Попытки закончились, ты проиграл :( ");
        }
    }
}


