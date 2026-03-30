package com.example;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Turbo turbo = new Turbo();
        Lights lights = new Lights();
        DriveMode sportMode = new DriveMode();


        engine.start();
        lights.on();
        sportMode.sportModeEnable();
        turbo.activate();

        System.out.println("\nSports car is ready!\n");

        turbo.deactivate();
        sportMode.ecoModeEnable();
        lights.off();
        engine.stop();
    }
}