package designPattern.behavioural.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  List<Observer> onserverList = new ArrayList<>();
  String name;
  int marks;

  public Subject(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
    notifyAllObservers();
  }

 public void addObserver(Observer observer){
    onserverList.add(observer);
  }

  private void notifyAllObservers() {
    for (Observer observer : onserverList) {
      observer.update();
    }
  }
}
