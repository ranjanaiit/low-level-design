package designPattern.creational.ProtoType;

public class Student implements ProtoType {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public ProtoType clone() {
    return new Student(name, age);
  }

  public void show() {
    System.out.println("Student: " + name + ", " + age);
  }
}
