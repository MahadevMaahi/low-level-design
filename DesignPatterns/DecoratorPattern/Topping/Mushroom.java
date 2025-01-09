package DesignPatterns.DecoratorPattern.Topping;

import DesignPatterns.DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator {
    private BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
