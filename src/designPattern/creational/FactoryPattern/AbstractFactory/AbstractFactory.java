package designPattern.creational.FactoryPattern.AbstractFactory;

import designPattern.creational.FactoryPattern.Shape;
import designPattern.creational.FactoryPattern.ShapeType;

public abstract class AbstractFactory {
  abstract Shape getShape(ShapeType shapeType);
}
