package com.gappu.interfaces;

public class Car implements Engine, Media {

    @Override
    public void start() {
        System.out.println("I start the car");
    }

    @Override
    public void stop() {
        System.out.println("I stop the car");
    }

    @Override
    public void play() {
        System.out.println("I play the music");
    }

    @Override
    public void pause() {
        System.out.println("I pause the music");
    }

    public static void main(String[] args) {
        Car maruti = new Car();
        maruti.start();
        maruti.stop();
//        maruti.pause();
//        maruti.play();
    }
}
