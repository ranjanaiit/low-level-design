package designPattern.creational.Singlton;

public class Singleton {

  private static final Singleton Instance = new Singleton();
  public void showMessage() {
    System.out.println("welcome to Singleton Pattern!");
  }
 public static Singleton getInstance() {
    return Instance;
  }
}
