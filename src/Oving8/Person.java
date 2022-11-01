package Oving8;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int yearOfBirth;


    /**
     * Constructor for Person
     * @param firstname First name of the person
     * @param lastName Last name of the person
     * @param yearOfBirth Year of birth of the person
     */
    public Person(String firstname, String lastName, int yearOfBirth) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Makes the variable firstname accessible outside the class
     * @return the firstname as String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Makes the variable lastname accessible outside the class
     * @return the lastname, represented as a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Makes the variable yearOfBirth accessible outside the class
     * @return the yearOfBirth
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
