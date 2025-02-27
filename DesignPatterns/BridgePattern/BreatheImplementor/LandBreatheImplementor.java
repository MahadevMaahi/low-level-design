package DesignPatterns.BridgePattern.BreatheImplementor;

public class LandBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Breathing in land");
    }
}
