package designPattern.behavioural.observerPattern;

public class HexaDecimalObserver extends Observer{

  HexaDecimalObserver(Subject subject){
    this.subject = subject;
    this.subject.addObserver(this);
  }
  @Override
  public void update() {
    System.out.println("HexaDecimalObserver: " + Integer.toHexString(subject.marks));
  }
}
