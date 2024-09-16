package com.gappu.abstract_class;

abstract public class Parent {
    int age;
    final static String country;

    static {
        country = "India";
    }

    abstract void career();

    abstract void partner();

    static void greet() {
        System.out.println("Hello from Parent");
    }

    Parent(int age) {
        this.age = age;
    }
}
