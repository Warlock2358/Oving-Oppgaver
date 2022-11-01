package Oving9;

import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TaskOverview taskOverview = new TaskOverview();
    String input = "";
    while (!input.equals("quit")) {
      System.out.println("Enter a command: ");
      input = scanner.nextLine();
      switch (input) {
        case "help" -> {
          System.out.println("Commands: ");
          System.out.println("help - shows this message");
          System.out.println("student - registers a student");
          System.out.println("task - registers a task");
          System.out.println("tasks - registers multiple tasks");
          System.out.println("getTasks - gets the number of tasks for a student");
          System.out.println("getStudents - gets the number of students registered");
          System.out.println("getAll - gets all students and their number of tasks");
          System.out.println("quit - quits the program");
        }
        case "student" -> {
          System.out.println("Enter the name of the student: ");
          String name = scanner.nextLine();
          taskOverview.registerStudent(name);
        }
        case "task" -> {
          System.out.println("Enter the name of the student: ");
          String name = scanner.nextLine();
          taskOverview.registerTask(name);
        }
        case "tasks" -> {
          System.out.println("Enter the name of the student: ");
          String name = scanner.nextLine();
          System.out.println("Enter the number of tasks: ");
          int numberOfTasks = Integer.parseInt(scanner.nextLine());
          taskOverview.registerTasks(name, numberOfTasks);
        }
        case "getTasks" -> {
          System.out.println("Enter the name of the student: ");
          String name = scanner.nextLine();
          System.out.println(taskOverview.getNumberOfTasks(name));
        }
        case "getStudents" -> System.out.println(taskOverview.getStudentsRegistered());
        case "getAll" -> System.out.println(taskOverview);
      }
    }
    scanner.close();
  }
}
