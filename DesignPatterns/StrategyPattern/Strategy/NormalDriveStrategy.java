package DesignPatterns.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    
    @Override
    public void Drive() {
        System.out.println("Normal Driving Capability");
    }
}