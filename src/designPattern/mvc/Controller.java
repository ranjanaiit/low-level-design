package designPattern.mvc;

public class Controller {

  View view;
  Student student;
  Controller(Student student,View view){
    this.student = student;
    this.view = view;

  }

 public void printDetails(){
   view.PrintStudentDetails(student);
  }
}
