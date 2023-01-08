package com.hillel.hrebeniev.homeworks.homework_16;

public class PopMusic extends MusicStyles{
    String name;
    @Override
    void playMusic() {
        System.out.println("Выступает группа " + name);
    }
}
