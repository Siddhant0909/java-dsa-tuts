package com.gappu.packages.staticexample;

public class Human {
    int age;
    String name;
    boolean isMarried;
    int salary;
    static long population;

    static void greeing() {
        System.out.println("Hello");
    }

    public Human(int age, String name, boolean isMarried, int salary) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.salary = salary;
        Human.population += 1;
    }
}
