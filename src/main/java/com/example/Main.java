package com.example;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Turbo turbo = new Turbo();
        Suspension suspension = new Suspension();
        Lights lights = new Lights();
        DriveMode driveMode = new DriveMode();


        engine.start();
        lights.on();
        driveMode.ecoModeEnable();
        suspension.high();
        turbo.activateLowPressure();

        System.out.println("\nCar is ready!\n");

        driveMode.sportModeEnable();
        turbo.activateHighPressure();
        suspension.low();

        System.out.println("\nSports car is ready!\n");

        turbo.activateLowPressure();
        driveMode.ecoModeEnable();
        lights.off();
        engine.stop();

        System.out.println("\nSports car has been shut down!\n");

    }
}