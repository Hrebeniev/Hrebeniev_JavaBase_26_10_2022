package com.hillel.hrebeniev.homeworks.homework_15;

import com.hillel.hrebeniev.homeworks.homework_15.interfaces.LinuxOS;
import com.hillel.hrebeniev.homeworks.homework_15.interfaces.Smartphones;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call to Maria");
    }

    @Override
    public void sms() {
        System.out.println("Send SMS to Maria");
    }

    @Override
    public void internet() {
        System.out.println("Search in Interneet");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("This is Linux");
    }
}
