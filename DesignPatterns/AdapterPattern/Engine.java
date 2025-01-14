package DesignPatterns.AdapterPattern;

import DesignPatterns.AdapterPattern.Adaptee.WeightMachineForBaby;
import DesignPatterns.AdapterPattern.Adapter.WeightMachineAdapter;
import DesignPatterns.AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Engine {
    public static void main(String[] args) {
        WeightMachineAdapter machine = new WeightMachineAdapterImpl(new WeightMachineForBaby());
        System.out.println(machine.getWeightInKg());
    }
}
