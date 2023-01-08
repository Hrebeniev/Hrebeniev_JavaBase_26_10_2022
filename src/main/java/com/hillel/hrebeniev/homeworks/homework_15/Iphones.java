package com.hillel.hrebeniev.homeworks.homework_15;

import com.hillel.hrebeniev.homeworks.homework_15.interfaces.IOS;
import com.hillel.hrebeniev.homeworks.homework_15.interfaces.Smartphones;

public class Iphones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Call to Anny");
    }

    @Override
    public void sms() {
        System.out.println("Send SMS to Nick");
    }

    @Override
    public void internet() {
        System.out.println("Search in Google");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("This is IOS");

    }
}
