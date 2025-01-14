package DesignPatterns.AdapterPattern.Adapter;

import DesignPatterns.AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    
    @Override
    public int getWeightInKg() {
        return weightMachine.getWeightInPound() + 10;
    }
}
