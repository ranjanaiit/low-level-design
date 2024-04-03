package designPattern.creational.Builder;

public class Student {
  String name;
  Long id;
  String address;
  Integer rollNo;

  public Student(StudentBuilder builder) {
    this.name = builder.name;
    this.id = builder.id;
    this.address = builder.address;
    this.rollNo = builder.rollNo;
  }

  public static class StudentBuilder {
    String name;
    Long id;
    String address;
    Integer rollNo;


    public StudentBuilder setAddress(String address) {
      this.address = address;
      return this;
    }

    public StudentBuilder setRollNo(Integer rollNo) {
      this.rollNo = rollNo;
      return this;
    }

    public StudentBuilder setId(Long id) {
      this.id = id;
      return this;
    }

    public StudentBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public Student build() {
      return new Student(this);
    }

    ;

    public String toString() {
      return "Student: " + name + ", " + id + ", " + address + ", " + rollNo;
    }
  }
}
