package Oving9;

public class Student {
  private final String name;
  private int numberOfTasks;

  public Student(String name, int numberOfTasks) {
    this.name = name;
    this.numberOfTasks = numberOfTasks;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfTasks() {
    return numberOfTasks;
  }

  public void setNumberOfTasks(int numberOfTasks) {
    this.numberOfTasks = numberOfTasks;
  }

  public String toString() {
    return name + " has completed " + numberOfTasks + " tasks.";
  }
}
