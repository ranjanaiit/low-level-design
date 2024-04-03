package designPattern.creational.FactoryPattern.singlton;

public class Singleton {

  private static final Singleton Instance = new Singleton();
  private Singleton() {
  }

  public void showMessage() {
    System.out.println("welcome to Singleton Pattern!");
  }
 public static Singleton getInstance() {
    return Instance;
  }
}
