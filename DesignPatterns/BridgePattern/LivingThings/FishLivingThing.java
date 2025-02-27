package DesignPatterns.BridgePattern.LivingThings;

import DesignPatterns.BridgePattern.BreatheImplementor.BreatheImplementor;

public class FishLivingThing extends LivingThing {
        
        public FishLivingThing(BreatheImplementor breatheImplementor) {
            super(breatheImplementor);
        }
    
        @Override
        public void breatheProcess() {
            System.out.println("Fish is breathing");
            breatheImplementor.breathe();
        }
    
}
