package DesignPatterns.BridgePattern.LivingThings;

import DesignPatterns.BridgePattern.BreatheImplementor.BreatheImplementor;

public class PlantLivingThing extends LivingThing{
    
    public PlantLivingThing(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Plant is breathing");
        breatheImplementor.breathe();
    }
}
