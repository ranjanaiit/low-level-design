package designPattern.creational.FactoryPattern.AbstractFactory;

import designPattern.creational.FactoryPattern.*;

public class ShapeFactory extends AbstractFactory {
  @Override
  Shape getShape(ShapeType shapeType) {
    switch (shapeType){
      case CIRCLE : return new Circle();
      case RECTANGLE : return new Rectangle();
      case SQUARE : return new Square();
      default: return null;

    }
  }
}