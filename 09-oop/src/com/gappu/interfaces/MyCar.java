package com.gappu.interfaces;

public class MyCar {
    private Engine engine;
    private Media media = new CDPlayer();

    public MyCar() {
        engine = new DEngine();
    }

    public MyCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        media.play();
    }

    public void stopMusic() {
        media.pause();
    }

    public static void main(String[] args) {
        Engine engine1 = new EEngine();
        MyCar car = new MyCar(engine1);
        car.start();
        car.startMusic();
    }
}
