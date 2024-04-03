package designPattern.creational.Singlton;

public class Main {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    singleton.showMessage();
  }
}
