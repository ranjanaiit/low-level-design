package designPattern.creational.FactoryPattern.FactoryMethod;

import designPattern.creational.FactoryPattern.ShapeFactory;
import designPattern.creational.FactoryPattern.ShapeType;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    shapeFactory.createShape(ShapeType.CIRCLE).show();
    shapeFactory.createShape(ShapeType.RECTANGLE).show();
    shapeFactory.createShape(ShapeType.SQUARE).show();
  }
}