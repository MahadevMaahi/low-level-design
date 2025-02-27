package DesignPatterns.BridgePattern.BreatheImplementor;

public class WaterBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Breathing in water");
    }
}
