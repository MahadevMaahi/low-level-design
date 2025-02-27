package DesignPatterns.BridgePattern;

import DesignPatterns.BridgePattern.BreatheImplementor.BreatheImplementor;
import DesignPatterns.BridgePattern.BreatheImplementor.LandBreatheImplementor;
import DesignPatterns.BridgePattern.BreatheImplementor.PhotosynthesisBreatheImplementor;
import DesignPatterns.BridgePattern.BreatheImplementor.WaterBreatheImplementor;
import DesignPatterns.BridgePattern.LivingThings.FishLivingThing;
import DesignPatterns.BridgePattern.LivingThings.HumanLivingThing;
import DesignPatterns.BridgePattern.LivingThings.LivingThing;
import DesignPatterns.BridgePattern.LivingThings.PlantLivingThing;

public class Client {
    public static void main(String[] args) {
        BreatheImplementor landBreatheImplementor = new LandBreatheImplementor();
        LivingThing human = new HumanLivingThing(landBreatheImplementor);

        BreatheImplementor watBreatheImplementor = new WaterBreatheImplementor();
        LivingThing fish = new FishLivingThing(watBreatheImplementor);

        BreatheImplementor photoBreatheImplementor = new PhotosynthesisBreatheImplementor();
        LivingThing tree = new PlantLivingThing(photoBreatheImplementor);

        human.breatheProcess();
        fish.breatheProcess();
        tree.breatheProcess();
    }
}
