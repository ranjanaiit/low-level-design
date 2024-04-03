package designPattern.creational.FactoryPattern;
public class ShapeFactory {
  public Shape createShape(ShapeType shapeType){
    Shape shape = null;
    if(shapeType == ShapeType.CIRCLE)
     shape = new Circle();
    else if(shapeType == ShapeType.RECTANGLE){
       shape = new Rectangle();
    }
    else if(shapeType == ShapeType.SQUARE){
       shape = new Square();
    }

    return shape;

  }
}