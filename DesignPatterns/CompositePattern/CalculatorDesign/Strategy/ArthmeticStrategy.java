package DesignPatterns.CompositePattern.CalculatorDesign.Strategy;

import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticEntry;
import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticOperator;

public class ArthmeticStrategy implements Strategy {

    public ArthmeticStrategy() {
    }
    
    @Override
    public int evaluate(
        ArthmeticEntry leftEntry,
        ArthmeticOperator o,
        ArthmeticEntry rightEntry
        ) {
        switch (o) {
            case ArthmeticOperator.ADD:
                return leftEntry.calculate() + rightEntry.calculate();
            case ArthmeticOperator.SUBTRACT:
                return leftEntry.calculate() - rightEntry.calculate();
            case ArthmeticOperator.MULTIPLY:
                return leftEntry.calculate() * rightEntry.calculate();
                case ArthmeticOperator.DIVIDE:
                return leftEntry.calculate() / rightEntry.calculate();
            default:
                return 0;
        }
    }
}
