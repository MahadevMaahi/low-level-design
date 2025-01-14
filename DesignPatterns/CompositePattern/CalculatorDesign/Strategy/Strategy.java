package DesignPatterns.CompositePattern.CalculatorDesign.Strategy;

import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticEntry;
import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticOperator;

public interface Strategy {
    public int evaluate(
        ArthmeticEntry leftEntry,
        ArthmeticOperator o,
        ArthmeticEntry rightEntry
    );
}
