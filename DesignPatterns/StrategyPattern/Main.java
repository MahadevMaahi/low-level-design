package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Vehicle.Vehicle;
import DesignPatterns.StrategyPattern.Vehicle.SportsVehicle;

public class Main {

    public static void main(String args[]) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
