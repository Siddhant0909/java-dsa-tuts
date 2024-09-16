package com.gappu.interfaces;

public class DEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starts the diesel engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops the diesel engine");
    }
}
