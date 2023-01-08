package com.hillel.hrebeniev.homeworks.homework_15;

import com.hillel.hrebeniev.homeworks.homework_15.interfaces.LinuxOS;
import com.hillel.hrebeniev.homeworks.homework_15.interfaces.Smartphones;
import com.hillel.hrebeniev.homeworks.homework_15.Iphones;

public class Main {
    public static void main(String[] args) {
        Iphones iphone1 = new Iphones();
        iphone1.call();
        iphone1.sms();
        iphone1.internet();
        iphone1.getOperationSystem();

        System.out.println();

        Androids android1 = new Androids();
        android1.call();
        android1.sms();
        android1.internet();
        android1.getOperationSystem();
    }
}
