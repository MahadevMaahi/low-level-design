package DesignPatterns.FactoryPattern.ShapeFactory;

import DesignPatterns.FactoryPattern.Shape.Circle;
import DesignPatterns.FactoryPattern.Shape.Rectangle;
import DesignPatterns.FactoryPattern.Shape.Shape;
import DesignPatterns.FactoryPattern.Shape.Square;

public class ShapeFactory {
    
    public Shape getShape(ShapeType type) {
        switch(type) {
            case ShapeType.CIRCLE :
                return new Circle();
            case ShapeType.RECTANGLE :
                return new Rectangle();
            case ShapeType.SQUARE :
                return new Square();
            default :
                return null;
        }
    }
}
