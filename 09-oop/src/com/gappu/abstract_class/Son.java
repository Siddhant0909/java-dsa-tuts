package com.gappu.abstract_class;

import java.util.ArrayList;
import java.util.List;

public class Son extends Parent {

    static void greet() {
        System.out.println("Hello from Son");
    }

    @Override
    void career() {
        System.out.println("wants to be a cook");
    }

    @Override
    void partner() {
        System.out.println("is a beautiful hallucination");
    }

    Son(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();
        son.greet();
        System.out.println(son.country);
    }
}
