package com.gappu.inheritance;

public class Block {
    double l;
    double h;
    double w;

    public void greeting() {
        System.out.println("Namaste");
    }

    Block() {
        this.w = -1;
        this.h = -1;
        this.l = -1;
    }

    //    cube
    Block(double side) {
        this.w = side;
        this.h = side;
        this.l = side;
    }

    Block(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Block(Block old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
