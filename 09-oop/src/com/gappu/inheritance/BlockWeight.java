package com.gappu.inheritance;

public class BlockWeight extends Block {
    double weight;

    BlockWeight() {
        this.weight = -1;
    }

    BlockWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
