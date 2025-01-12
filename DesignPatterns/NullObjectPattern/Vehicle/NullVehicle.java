package DesignPatterns.NullObjectPattern.Vehicle;

public class NullVehicle implements Vehicle {

    @Override
    public int getFullTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
    
}
