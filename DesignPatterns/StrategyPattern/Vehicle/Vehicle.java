package DesignPatterns.StrategyPattern.Vehicle;

import DesignPatterns.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy strategy) {
        this.driveStrategy = strategy;
    }

    public void drive() {
        driveStrategy.Drive();
    }
}
