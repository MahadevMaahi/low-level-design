package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Pizza.BasePizza;
import DesignPatterns.DecoratorPattern.Pizza.Margerita;
import DesignPatterns.DecoratorPattern.Topping.ExtraCheeze;
import DesignPatterns.DecoratorPattern.Topping.Mushroom;

public class Engine {
    
    public static void main(String args[]) {
        BasePizza pizza = new Mushroom(
            new ExtraCheeze(
                new Margerita()
            )
        );

        System.out.println(pizza.cost());
    }
}
