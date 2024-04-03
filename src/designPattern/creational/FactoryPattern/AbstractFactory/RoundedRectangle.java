package designPattern.creational.FactoryPattern.AbstractFactory;

import designPattern.creational.FactoryPattern.Shape;

public class RoundedRectangle implements Shape {
  @Override
  public void show() {
    System.out.println("Inside RoundedRectangle::show() method.");
  }
}
