package com.hillel.hrebeniev.homeworks.homework_2;

public class Main {
    public static void main(String[] args) {
        byte byte1 = 46;
        byte byte2 = 29;
        float fl1 = 14.28F;

        String charN1 = "\u00B0";
        String charN2 = "\u0027";
        String charN3 = "\u301E";
        String charN4 = "\u0020";

        byte byte3 = 30;
        byte byte4 = 44;
        float fl2 = 21.48F;

        System.out.println("Coordinates of Monument to the founders of Odesa:");
        System.out.println(+byte1+charN1+byte2+charN2+fl1+charN3+"N"+charN4+byte3+charN1+byte4+charN2+fl2+charN3+"E");

    }
}
