package designPattern.creational.FactoryPattern.AbstractFactory;

import designPattern.creational.FactoryPattern.RoundedRectangle;
import designPattern.creational.FactoryPattern.RoundedSquare;
import designPattern.creational.FactoryPattern.Shape;
import designPattern.creational.FactoryPattern.ShapeType;

public class RoundedShapeFactory extends AbstractFactory {
  @Override
  Shape getShape(ShapeType shapeType) {
    switch (shapeType){
      case RECTANGLE : return new RoundedRectangle();
      case SQUARE : return new RoundedSquare();
      default: return null;

    }
  }
}
