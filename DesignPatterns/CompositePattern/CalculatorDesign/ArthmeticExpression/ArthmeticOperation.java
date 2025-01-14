package DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression;

import DesignPatterns.CompositePattern.CalculatorDesign.Strategy.Strategy;

public class ArthmeticOperation implements ArthmeticEntry {

    private ArthmeticEntry leftExpression;
    private ArthmeticEntry rightExpression;
    private ArthmeticOperator arthmeticOperator;
    private Strategy arthmeticStrategy;

    public ArthmeticOperation(
        ArthmeticEntry leftExpression,
        ArthmeticOperator arthmeticOperator,
        ArthmeticEntry rightExpression,
        Strategy arthmeticStrategy
    ) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.arthmeticOperator = arthmeticOperator;
        this.arthmeticStrategy = arthmeticStrategy;
    }
    
    @Override
    public int calculate() {
            return arthmeticStrategy.evaluate(
                leftExpression,
                arthmeticOperator,
                rightExpression
            );
    }
}
