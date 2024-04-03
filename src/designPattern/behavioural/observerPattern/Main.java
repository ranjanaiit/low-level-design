package designPattern.behavioural.observerPattern;

public class Main {
  public static void main(String[] args) {
    Subject subject = new Subject("ranjana", 10);
    new HexaDecimalObserver(subject);
    new DecimalObserver(subject);
    new BinaryObserver(subject);
    subject.setMarks(10);
    subject.setMarks(20);
  }
}
