package DesignPatterns.StrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void Drive() {
        System.out.println("Sports Driving");
    }
    
}