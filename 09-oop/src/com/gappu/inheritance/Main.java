package com.gappu.inheritance;


import com.gappu.access_control.Chashma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Block box1 = new Block(4);
        Block box2 = new Block(box1);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BlockWeight box3 = new BlockWeight();
        BlockWeight box4 = new BlockWeight(1, 2, 3, 4);
        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);
        box4.greeting();
//        Chashma chashma = new Chashma(2,"red",1200);
//        System.out.println(chashma.price);

//        Block box5 = new BlockWeight(1, 3, 5, 10);
////        System.out.println(box5.weight);
//        BlockWeight box6 = new Block();
//        System.out.println(box6.weight);
    }
}
