package com.example;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Turbo turbo = new Turbo();
        Lights lights = new Lights();
        SportMode sportMode = new SportMode();


        engine.start();
        lights.on();
        sportMode.enable();
        turbo.activate();
        
        System.out.println("\nSports car is ready!\n");

        turbo.deactivate();
        sportMode.disable();
        lights.off();
        engine.stop();
    }
}