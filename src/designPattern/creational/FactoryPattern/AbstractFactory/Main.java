package designPattern.creational.FactoryPattern.AbstractFactory;

import designPattern.creational.FactoryPattern.ShapeType;

public class Main {
  public static void main(String[] args) {
    AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
    shapeFactory.getShape(ShapeType.RECTANGLE).show();
    shapeFactory.getShape(ShapeType.SQUARE).show();
  }
}