package designPattern.creational.FactoryPattern.AbstractFactory;

import designPattern.creational.FactoryPattern.Shape;

public class RoundedSquare implements Shape {
  @Override
  public void show() {
    System.out.println("Inside RoundedSquare::show() method.");
  }
}
