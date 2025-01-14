package DesignPatterns.CompositePattern.CalculatorDesign.ArthmeticExpression;

public class ArthmeticExpression implements ArthmeticEntry {

    private int number;

    public ArthmeticExpression(int number) {
        this.number = number;
    }
    
    @Override
    public int calculate() {
        return number;
    }
}
