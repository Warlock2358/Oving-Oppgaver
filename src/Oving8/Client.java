package Oving8;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstname = in.nextLine();
        System.out.print("Enter last name: ");
        String lastname = in.nextLine();
        System.out.print("Enter year of birth: ");
        int yearOfBirth = in.nextInt();
        Person person = new Person(firstname, lastname, yearOfBirth);

        System.out.print("Enter employee number: ");
        int employeeNumber = in.nextInt();
        System.out.print("Enter year of employment: ");
        int yearOfEmployment = in.nextInt();
        System.out.print("Enter monthly salary: ");
        double monthlySalary = in.nextDouble();
        System.out.print("Enter tax percentage: ");
        double taxPercentage = in.nextDouble();
        Employee employee = new Employee(person, employeeNumber, yearOfEmployment, monthlySalary, taxPercentage);

        printText(employee);

        //noinspection InfiniteLoopStatement
        while (true) {
            showMenu(employee);
        }
    }

    /**
     * method to show the menu, which contains the options to change the salary or tax percentage
     * @param employee the employee object form the class Employee is used as a variable to access the methods
     */
    private static void showMenu(Employee employee) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Change salary");
        System.out.println("2. Change tax percentage");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter new salary: ");
                double newSalary = in.nextDouble();
                employee.setMonthlySalary(newSalary);
                printText(employee);
            }
            case 2 -> {
                System.out.print("Enter new tax percentage: ");
                double newTaxPercentage = in.nextDouble();
                employee.setTaxPercentage(newTaxPercentage);
                printText(employee);
            }
            case 3 -> {
                System.out.println("Exiting...");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice, try again");
        }
    }

    /**
     * Prints information about the employee
     * @param employee Employee object
     */
    public static void printText(Employee employee) {
        System.out.println(employee);
    }
}
