package com.hillel.hrebeniev.homeworks.homework_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первой команды");
        String firstTeam = scanner.nextLine();
        System.out.println(firstTeam);

        System.out.println("Введите колличество фрагов Игрока 1");
        double firstTeam_player1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 2");
        double firstTeam_player2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 3");
        double firstTeam_player3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 4");
        double firstTeam_player4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 5");
        double firstTeam_player5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя второй команды");
        String secondTeam = scanner.nextLine();
        System.out.println(secondTeam);

        System.out.println("Введите колличество фрагов Игрока 1");
        double secondTeam_player1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 2");
        double secondTeam_player2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 3");
        double secondTeam_player3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 4");
        double secondTeam_player4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 5");
        double secondTeam_player5 = scanner.nextInt();
        scanner.nextLine();

        double fragsFirstTeam =
                (firstTeam_player1 + firstTeam_player2 + firstTeam_player3 +
                        firstTeam_player4 + firstTeam_player5) / 5;
        System.out.println(fragsFirstTeam);

        double fragsSecondTeam = (secondTeam_player1 + secondTeam_player2 +
                secondTeam_player3 + secondTeam_player4 + secondTeam_player5) / 5;
        System.out.println(fragsSecondTeam);

        if (fragsFirstTeam > fragsSecondTeam) {
            System.out.println("Победила команда " + firstTeam + ", набрала " + fragsFirstTeam + " очков");
        } else if (fragsFirstTeam < fragsSecondTeam) {
            System.out.println("Победила команда " + secondTeam + ", набрала " + fragsSecondTeam + " очков");
        } else {
            System.out.println("Ничья");
        }
    }
}

