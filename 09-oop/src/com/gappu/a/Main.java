package com.gappu.a;

import static com.gappu.b.Packages.greeting;

public class Main {
    public static void main(String[] args) {
//        com.gappu.a.Student sid = new com.gappu.a.Student();
        Student sid = new Student(94, "Siddhant", 7.03f);
        sid.chageName("GAPPU");
        System.out.println(sid.name);
//        greeting();
    }


}

class Student {
    int rollno;
    String name;
    float marks;

    void chageName(String newName) {
        this.name = newName;
    }

    Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

