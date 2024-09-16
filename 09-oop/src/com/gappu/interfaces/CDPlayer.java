package com.gappu.interfaces;

public class CDPlayer implements Media {
    @Override
    public void play() {
        System.out.println("Start Music");
    }

    @Override
    public void pause() {
        System.out.println("Stop Music");
    }
}
