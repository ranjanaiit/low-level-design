package designPattern.creational.ProtoType;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("John", 20);
    student.show();
    Student student2 = (Student) student.clone();
    student2.show();
  }
}
