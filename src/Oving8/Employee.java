package Oving8;

import java.util.*;

public class Employee {
    private final Person personalia;
    private final int employeeNumber;
    private final int yearOfEmployment;
    private double monthlySalary;
    private double taxPercentage;
    private GregorianCalendar calendar = new GregorianCalendar();

    /**
     * Constructor for Employee
     *
     * @param personalia       Person object containing personalia
     * @param employeeNumber   Employee number of the employee
     * @param yearOfEmployment Year of employment of the employee
     * @param monthlySalary    Salary of the employee
     * @param taxPercentage    Tax percentage of the employee
     */

    public Employee(Person personalia, int employeeNumber, int yearOfEmployment, double monthlySalary, double taxPercentage) {
        this.personalia = personalia;
        this.employeeNumber = employeeNumber;
        this.yearOfEmployment = yearOfEmployment;
        this.monthlySalary = monthlySalary;
        this.taxPercentage = taxPercentage;
    }

    /**
     * Makes the variable employeeNumber accessible outside the class
     *
     * @return the employeeNumber
     */
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Makes the variable yearOfEmployment accessible outside the class
     *
     * @return the yearOfEmployment
     */
    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    /**
     * Makes the variable monthlySalary accessible outside the class
     *
     * @return the monthlySalary
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Method to change the monthly salary of the employee
     *
     * @param newSalary The new salary of the employee
     */
    public void setMonthlySalary(double newSalary) {
        this.monthlySalary = newSalary;
    }

    /**
     * Method to change the tax percentage of the employee
     *
     * @param newTaxPercentage The new tax percentage of the employee
     */
    public void setTaxPercentage(double newTaxPercentage) {
        this.taxPercentage = newTaxPercentage;
    }

    /**
     * Method to calculate the amount of tax the employee has to pay each month
     *
     * @return taxPayed The amount of tax the employee has to pay
     */
    public double getMonthlyTaxPayed() {
        return monthlySalary * (taxPercentage / 100); // Tax paid is the monthly salary multiplied by the tax percentage
    }

    /**
     * Method to calculate the yearly tax paid by the employee
     *
     * @return yearlyTaxPayed The yearly tax paid by the employee
     */
    public double getYearlyTaxPayed() {
        return (getMonthlyTaxPayed() * 10) + (getMonthlyTaxPayed() * 0.5); //Calculates the yearly tax paid by the employee
    }

    /**
     * Method to calculate the yearly salary of the employee
     *
     * @return yearlySalary The yearly salary of the employee
     */
    public double getGrossYearlySalary() {
        return monthlySalary * 12; //Calculates the yearly salary of the employee
    }

    /**
     * Method to calculate the yearly salary of the employee after tax
     *
     * @return yearlySalaryAfterTax The yearly salary of the employee after tax
     */
    public double getNetYearlySalary() {
        return getGrossYearlySalary() - getYearlyTaxPayed(); //Calculates the yearly salary of the employee after tax
    }

    /**
     * Method to print the employee's age
     * @return age The age of the employee
     */
    public int getAge() {
        return calendar.get(Calendar.YEAR) - personalia.getYearOfBirth(); //Gets the current year and subtracts the year of birth
    }

    /**
     * Method to print the employee's name
     * @return name The name of the employee
     */
    public String getName() {
        return personalia.getFirstName() + ", " + personalia.getLastName();
    }

    /**
     * Method to calculate the amount of years the employee has worked
     *
     * @return yearsWorked The amount of years the employee has worked
     */
    public int getYearsWorked() {
        return calendar.get(Calendar.YEAR) - yearOfEmployment; //Gets the current year and subtracts the year of employment
    }

    /**
     * Method to check if the employee has been employed {@link #getYearsWorked()} for more than a set amount of years
     * @param years The amount of years the employee has to have worked
     * @return true if the employee has worked more than the set amount of years, false if not
     */
    public boolean getEmployedLongerThan(int years) {
        return getYearsWorked() >= years; //Checks if the employee has worked more than the set amount of years. If so, returns true, if not, returns false
    }

    /**
     * Method to print the employee's information
     */
    @Override
    public String toString() {
        return "\nEmployee information:" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nEmployee number: " + getEmployeeNumber() +
                "\nMonthly income: " + getMonthlySalary() +
                "\nTax payed per month: " + getMonthlyTaxPayed() +
                "\nYearly tax payed: " + getYearlyTaxPayed() +
                "\nYearly gross salary: " + getGrossYearlySalary() +
                "\nYearly net salary: " + getNetYearlySalary() +
                "\nYears hired: " + getYearOfEmployment() +
                "\nEmployed more than 5 years? " + getEmployedLongerThan(5);
    }
}
