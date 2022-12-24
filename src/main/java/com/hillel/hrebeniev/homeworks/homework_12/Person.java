package com.hillel.hrebeniev.homeworks.homework_12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    public static String personInfo(String name, String surname, String city, String phoneNumber) {
        String person = "Позвонить гражданину " + name + " " + surname +
                " из города " + city + " можно по номеру: " + phoneNumber;
        return person;
    }
}
