package com.gappu.access_control;

public class Main {
    public static void main(String[] args) {
        Chashma chashma1 = new Chashma(2, "brown", 2000);
        chashma1.setColor("bhura");
        System.out.println(chashma1.getColor());
        System.out.println(chashma1.power);
    }
}
