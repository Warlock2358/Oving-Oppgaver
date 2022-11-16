package Oving11;

import java.util.Scanner;

/**
 * User interface for the property register.
 *
 * @author Isak Mandal
 */
public class UserInterface {

  private static final Scanner in = new Scanner(System.in);
  PropertyRegister propertyRegister = new PropertyRegister();

  /**
   * This is the main method for the UserInterface class. It is used to start the program.
   *
   * @param args The arguments that are entered when the program is run.
   */
  public static void main(String[] args) {
    UserInterface i = new UserInterface();

    i.testData();
    i.start();
  }

  /**
   * This method is used to fill the property register with test data.
   */
  public void testData() {
    boolean ok = false;
    try {
      propertyRegister.registerProperty(1445, 77, 631, "Gloppen", "", "Jens Olsen", 1017.6);
      propertyRegister.registerProperty(1445, 77, 131, "Gloppen", "Syningom", "Nicolay Madsen",
          661.3);
      propertyRegister.registerProperty(1445, 75, 19, "Gloppen", "Fugletun", "Evilyn Jensen",
          650.6);
      propertyRegister.registerProperty(1445, 74, 188, "Gloppen", "", "Karl Ove Bråten", 1457.2);
      propertyRegister.registerProperty(1445, 69, 47, "Gloppen", "Høiberg", "Elsa Indregård",
          1339.4);
      ok = true;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    if (ok) {
      System.out.println("Test succesful");
    }
  }

  /**
   * This method is used to start the program. Creates a boolean variable that is used for
   * controlling the while loop. Uses values from showMenu method in an enhanced switch statement,
   * where other methods are called, depending on the input from the user.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void start() {
    boolean finished = false;

    while (!finished) {
      int choice = this.showMenu();
      Choice choiceEnum = Choice.getChoice(choice);

      if (choiceEnum != null) {
        switch (choiceEnum) {
          case GET_PROPERTIES -> getProperties();
          case REGISTER_PROPERTY -> registerProperty();
          case REMOVE_PROPERTY -> removeProperty();
          case GET_NUMBER_OF_PROPERTIES -> getNumberOfProperties();
          case FIND_PROPERTY -> findProperty();
          case GET_PROPERTIES_BY_MUNICIPALITY_NUMBER -> getPropertiesByMunicipalityNumber();
          case GET_PROPERTIES_BY_LOT_NUMBER -> getPropertiesByLotNumber();
          case GET_AVERAGE_AREA -> getAverageArea();
          case GET_OWNER_OF_PROPERTY -> getOwnerOfProperty();
          case CHANGE_MUNICIPALITY_NUMBER -> changeMunicipalityNumber();
          case CHANGE_MUNICIPALITY_NAME -> changeMunicipalityName();
          case CHANGE_LOT_NAME -> changeLotName();
          case CHANGE_OWNER_NAME -> changeNameOfOwner();
          case EXIT -> {
            System.out.println("Exiting...");
            finished = true;
          }
          default -> System.out.println("Invalid choice");
        }
      }
    }
  }

  /**
   * This method is used to show the menu to the user.
   *
   * @return The choice that the user has made.
   */
  public int showMenu() {
    int menuChoice = 0;
    String LS = System.lineSeparator();
    String menu = "1.  Get all properties" + LS + "2.  Register property" + LS
        + "3.  Remove property" + LS + "4.  Get number of properties" + LS
        + "5.  Find property" + LS + "6.  Get properties by municipality number"
        + LS + "7.  Get properties by lot number" + LS
        + "8.  Get average area" + LS + "9.  Get owner of property" + LS
        + "10. Change municipality number" + LS + "11. Change municipality name"
        + LS + "12. Change lot name" + LS + "13. Change owner name"
        + LS + "14. Exit" + LS + "Please enter a number between 1-14";

    System.out.println(menu);

    if (in.hasNextInt()) {
      menuChoice = in.nextInt();
    } else {
      System.out.println("Invalid input");
    }

    return menuChoice;
  }

  /**
   * This method is used to get all properties from the property register.
   */
  public void getProperties() {
    System.out.println(propertyRegister.getProperties());
  }

  /**
   * This method is used to register a property in the property register.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void registerProperty() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter the municipality name: ");
    String municipalityName = in.nextLine();
    System.out.println("Enter lot name: ");
    String lotName = in.nextLine();
    System.out.println("Enter owner name: ");
    String ownerName = in.nextLine();
    System.out.println("Enter area: ");
    double area = in.nextDouble();
    in.nextLine();

    try {
      propertyRegister.registerProperty(municipalityNumber, lotNumber, sectionNumber,
          municipalityName, lotName, ownerName, area);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to remove a property from the property register.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void removeProperty() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    try {
      propertyRegister.removeProperty(municipalityNumber, lotNumber, sectionNumber);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to get the number of properties in the property register.
   */
  public void getNumberOfProperties() {
    System.out.println(propertyRegister.getNumberOfProperties());
  }

  /**
   * This method is used to find a property in the property register.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void findProperty() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    try {
      System.out.println(propertyRegister.findProperty(municipalityNumber, lotNumber,
          sectionNumber));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to get all properties with a specific municipality number.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void getPropertiesByMunicipalityNumber() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    try {
      System.out.println(propertyRegister.getPropertiesByMunicipalityNumber(municipalityNumber));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to get all properties with a specific lot number.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void getPropertiesByLotNumber() {
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();

    try {
      System.out.println(propertyRegister.getPropertiesByLotNumber(lotNumber));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to get the average area of all properties in the property register.
   */
  public void getAverageArea() {
    System.out.println(propertyRegister.getAverageArea());
  }

  /**
   * This method is used to get the owner of a property.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void getOwnerOfProperty() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    try {
      System.out.println(propertyRegister.getOwnerOfProperty(municipalityNumber, lotNumber,
          sectionNumber));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to change the municipality number of a property.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void changeMunicipalityNumber() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter new municipality number: ");
    int newMunicipalityNumber = in.nextInt();
    in.nextLine();
    try {
      propertyRegister.changeMunicipalityNumber(municipalityNumber, lotNumber, sectionNumber,
          newMunicipalityNumber);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to change the lot number of a property.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void changeMunicipalityName() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter new municipality name: ");
    String newMunicipalityName = in.nextLine();

    try {
      propertyRegister.changeMunicipalityName(municipalityNumber, lotNumber, sectionNumber,
          newMunicipalityName);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to change the lot number of a property.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void changeLotName() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter new lot name: ");
    String newLotName = in.nextLine();

    try {
      propertyRegister.changeLotName(municipalityNumber, lotNumber, sectionNumber, newLotName);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is used to change the section number of a property.
   * Throws an IllegalArgumentException if the input is not valid.
   */
  public void changeNameOfOwner() {
    System.out.println("Enter municipality number: ");
    int municipalityNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter lot number: ");
    int lotNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter section number: ");
    int sectionNumber = in.nextInt();
    in.nextLine();
    System.out.println("Enter new owner name: ");
    String newOwnerName = in.nextLine();

    try{
      propertyRegister.changeNameOfOwner(municipalityNumber, lotNumber, sectionNumber, newOwnerName);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
