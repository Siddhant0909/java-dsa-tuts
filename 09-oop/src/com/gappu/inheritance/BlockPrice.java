package com.gappu.inheritance;

public class BlockPrice extends BlockWeight {
    double price;

    public BlockPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
