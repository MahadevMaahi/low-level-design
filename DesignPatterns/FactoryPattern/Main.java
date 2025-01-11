package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.Shape.Shape;
import DesignPatterns.FactoryPattern.ShapeFactory.ShapeFactory;
import DesignPatterns.FactoryPattern.ShapeFactory.ShapeType;

public class Main {
    
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}
