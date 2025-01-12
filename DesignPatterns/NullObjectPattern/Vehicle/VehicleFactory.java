package DesignPatterns.NullObjectPattern.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == "CAR") {
            return new Car();
        }
        return new NullVehicle();
    }
}
