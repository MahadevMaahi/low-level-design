package DesignPatterns.BridgePattern.BreatheImplementor;

public class PhotosynthesisBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Breathing through photosynthesis");
    }
}
