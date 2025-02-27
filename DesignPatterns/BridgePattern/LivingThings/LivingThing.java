package DesignPatterns.BridgePattern.LivingThings;

import DesignPatterns.BridgePattern.BreatheImplementor.BreatheImplementor;

public abstract class LivingThing {
    
    public BreatheImplementor breatheImplementor;
    
    public LivingThing(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
