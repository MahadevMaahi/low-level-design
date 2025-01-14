package DesignPatterns.CompositePattern.CalculatorDesign;

import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticEntry;
import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticExpression;
import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticOperation;
import DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression.ArthmeticOperator;
import DesignPatterns.CompositePattern.CalculatorDesign.Strategy.ArthmeticStrategy;
import DesignPatterns.CompositePattern.CalculatorDesign.Strategy.Strategy;

public class Engine {
    public static void main(String[] args) {
        Strategy strategy = new ArthmeticStrategy();
        ArthmeticEntry entry1 = new ArthmeticExpression(5);
        ArthmeticEntry entry2 = new ArthmeticExpression(5);
        ArthmeticEntry entry3 = new ArthmeticExpression(20);
        ArthmeticEntry entry4 = new ArthmeticExpression(2);
        ArthmeticEntry entry5 = new ArthmeticExpression(5);
        ArthmeticEntry expression = new ArthmeticOperation(
            new ArthmeticOperation(entry1, ArthmeticOperator.ADD, entry2, strategy),
            ArthmeticOperator.MULTIPLY,
            new ArthmeticOperation(
                entry3,
                ArthmeticOperator.SUBTRACT,
                 new ArthmeticOperation(
                    entry4,
                    ArthmeticOperator.MULTIPLY,
                     entry5,
                     strategy
                ),
                strategy
            ),
            strategy
        );
        System.out.println(expression.calculate());
    }
}
