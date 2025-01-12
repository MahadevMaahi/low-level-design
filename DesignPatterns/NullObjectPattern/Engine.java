package DesignPatterns.NullObjectPattern;

import DesignPatterns.NullObjectPattern.Vehicle.Vehicle;
import DesignPatterns.NullObjectPattern.Vehicle.VehicleFactory;

public class Engine {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle("CAR");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getFullTankCapacity());
}
}
