package Oving9;

import java.util.ArrayList;

public class TaskOverview {

  private ArrayList<Student> students;
  private int numberOfStudents = 0;

  public TaskOverview() {
    students = new ArrayList<Student>();
  }

  public int getStudentsRegistered() {
    return numberOfStudents;
  }

  public int getNumberOfTasks(String name) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        return student.getNumberOfTasks();
      }
    }
    return -1;
  }

  public void registerStudent(String name) {
    students.add(new Student(name, 0));
    numberOfStudents++;
  }

  public void registerTask(String name) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        student.setNumberOfTasks(student.getNumberOfTasks() + 1);
      }
    }
  }

  public void registerTasks(String name, int numberOfTasks) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        student.setNumberOfTasks(student.getNumberOfTasks() + numberOfTasks);
      }
    }
  }

  public String toString() {
    String output = "";
    for (Student student : students) {
      output += student.toString() + " | ";
    }
    return output;
  }
}
