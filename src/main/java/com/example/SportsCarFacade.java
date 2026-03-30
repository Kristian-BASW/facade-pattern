package com.example;

public class SportsCarFacade {

    private final Lights _lights;
    private final DriveMode _driveMode;
    private final Suspension _suspension;
    private final Turbo _turbo;
    private final Engine _engine;

    public SportsCarFacade(){
        _engine = new Engine();
        _turbo = new Turbo();
        _suspension = new Suspension();
        _driveMode = new DriveMode();
        _lights = new Lights();
    }

    public void startCar(){
        System.out.println("\nStarting the car\n");

        _engine.start();
        _lights.on();
        _suspension.high();
        _turbo.activateLowPressure();
        _driveMode.ecoModeEnable();

        System.out.println("\nCar is ready\n");
    }

    public void stopCar(){

        System.out.println("\nStopping the car\n");

        _engine.stop();
        _lights.off();

        System.out.println("\nThe car has been stopped\n");
    }

    public void activateEcoMode(){
        System.out.println("\nThe car is ready for a long run\n");
        
        _suspension.high();
        _turbo.activateLowPressure();
        _driveMode.ecoModeEnable();
    }

    public void activateSportMode(){
        System.out.println("\nThe car is ready for a race\n");
        
        _suspension.low();
        _turbo.activateHighPressure();
        _driveMode.sportModeEnable();
    }

    /**
     * THIS IS BAD
     */
    public void activateEcoModeWithLowSuspension(){
        _suspension.low();
        _turbo.activateLowPressure();
        _driveMode.ecoModeEnable();
    }

    /**
     * THIS IS BAD
     */
    public void activateEcoModeWithMediumSuspension(){
        _suspension.low();
        _turbo.activateLowPressure();
        _driveMode.ecoModeEnable();
    }
}
