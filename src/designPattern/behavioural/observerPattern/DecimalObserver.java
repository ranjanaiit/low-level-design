package designPattern.behavioural.observerPattern;

public class DecimalObserver extends Observer {

  DecimalObserver(Subject subject){
    this.subject = subject;
    this.subject.addObserver(this);
  }
  @Override
  public void update() {
    System.out.println("DecimalObserver: " + subject.marks);
  }
}
