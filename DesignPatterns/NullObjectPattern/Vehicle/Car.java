package DesignPatterns.NullObjectPattern.Vehicle;

public class Car implements Vehicle {

    @Override
    public int getFullTankCapacity() {
        return 20;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
    
}
