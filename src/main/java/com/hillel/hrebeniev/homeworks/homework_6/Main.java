package com.hillel.hrebeniev.homeworks.homework_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первой команды");
        String FirstTeam = scanner.nextLine();
        System.out.println(FirstTeam);

        System.out.println("Введите колличество фрагов Игрока 1");
        int FirstTeam_player1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 2");
        int FirstTeam_player2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 3");
        int FirstTeam_player3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 4");
        int FirstTeam_player4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 5");
        int FirstTeam_player5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя второй команды");
        String SecondTeam = scanner.nextLine();
        System.out.println(SecondTeam);

        System.out.println("Введите колличество фрагов Игрока 1");
        int SecondTeam_player1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 2");
        int SecondTeam_player2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 3");
        int SecondTeam_player3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 4");
        int SecondTeam_player4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите колличество фрагов Игрока 5");
        int SecondTeam_player5 = scanner.nextInt();
        scanner.nextLine();

        int FragsFirstTeam = (FirstTeam_player1+FirstTeam_player2+FirstTeam_player3
                +FirstTeam_player4+FirstTeam_player5) / 5;

        int FragsSecondTeam = (SecondTeam_player1+SecondTeam_player2+SecondTeam_player3
                +SecondTeam_player4+SecondTeam_player5) / 5;

        if (FragsFirstTeam > FragsSecondTeam) {
            System.out.println("Победила команда " + FirstTeam + ", набрала " + FragsFirstTeam + " очков");
        } else if (FragsFirstTeam < FragsSecondTeam) {
            System.out.println("Победила команда " + SecondTeam + ", набрала " + FragsSecondTeam + " очков");
        } else {
                    System.out.println("Ничья");
                }
        }
    }

