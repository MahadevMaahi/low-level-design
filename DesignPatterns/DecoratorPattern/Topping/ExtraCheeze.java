package DesignPatterns.DecoratorPattern.Topping;

import DesignPatterns.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheeze extends ToppingDecorator {
    
    private BasePizza basePizza;

    public ExtraCheeze(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
