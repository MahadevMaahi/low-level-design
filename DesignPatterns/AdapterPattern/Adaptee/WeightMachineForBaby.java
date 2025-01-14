package DesignPatterns.AdapterPattern.Adaptee;

public class WeightMachineForBaby implements WeightMachine {
    
    @Override
    public int getWeightInPound() {
        return 45;
    }
}
