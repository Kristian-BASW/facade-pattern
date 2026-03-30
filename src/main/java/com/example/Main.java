package com.example;

public class Main {
    public static void main(String[] args) {
        SportsCarFacade sportsCarFacade = new SportsCarFacade();
        System.out.println("\nThe user wants to start the car");
        sportsCarFacade.startCar();

        System.out.println("\nThe user wants to go for a race");
        sportsCarFacade.activateSportMode();

        System.out.println("\nThe user wants to stop the car");
        sportsCarFacade.stopCar();

    }
}