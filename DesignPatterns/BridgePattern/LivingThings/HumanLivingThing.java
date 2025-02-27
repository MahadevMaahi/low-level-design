package DesignPatterns.BridgePattern.LivingThings;

import DesignPatterns.BridgePattern.BreatheImplementor.BreatheImplementor;

public class HumanLivingThing extends LivingThing {
    
    public HumanLivingThing(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Human is breathing");
        breatheImplementor.breathe();
    }
    
}
