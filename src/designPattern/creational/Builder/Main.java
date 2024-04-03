package designPattern.creational.Builder;

public class Main {
  public static void main(String[] args) {
    Student student =new Student.StudentBuilder()
      .setName("John")
      .setId(1L)
      .setAddress("123 Main St")
      .setRollNo(123)
      .build();
    System.out.println(student.toString());
  }
}
