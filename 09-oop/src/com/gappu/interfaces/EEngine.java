package com.gappu.interfaces;

public class EEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starts the electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops the electric engine");
    }
}
