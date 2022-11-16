package Oving11;

import java.util.ArrayList;

/**
 * Class administers a property register, with methods for adding, removing and retrieving properties.
 *
 * @author Isak Mandal
 */
public class PropertyRegister {

  //I choose ArrayList because it is what I am most familiar with.
  private final ArrayList<Property> properties;

  /**
   * Constructor for PropertyRegister, containing all the properties.
   * Creates a new ArrayList of properties.
   */
  public PropertyRegister() {
    properties = new ArrayList<>();
  }

  /**
   * This method is used to fetch all the properties in the register.
   */
  public ArrayList<Property> getProperties() {
    ArrayList<Property> list = new ArrayList<>();
    for (Property property : properties) {
      Property propertiesCopy = new Property(property);
      list.add(propertiesCopy);
    }
    return list;
  }

  /**
   * This method is used to add a property to the register.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   * @param municipalityName   The municipality name of the property.
   * @param lotName            The lot name of the property.
   * @param nameOfOwner        The name of the owner of the property.
   * @param area               The area of the property in m^2.
   */
  public void registerProperty(int municipalityNumber, int lotNumber, int sectionNumber,
      String municipalityName, String lotName, String nameOfOwner, double area) {
    Property newProperty = new Property(municipalityNumber, lotNumber, sectionNumber,
        municipalityName, lotName, nameOfOwner, area);
    properties.add(newProperty);
  }

  /**
   * This method is used to remove a property from the register.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   */
  public void removeProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
    properties.removeIf(property -> property.getMunicipalityNumber() == municipalityNumber
        && property.getLotNumber() == lotNumber
        && property.getSectionNumber() == sectionNumber);
  }

  /**
   * This method is used to find the amount of properties in the register.
   */
  public int getNumberOfProperties() {
    return properties.size();
  }

  /**
   * This method is used to find a single property in the register.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   *
   * @return The property if found, otherwise throws an IllegalArgumentException.
   */
  public ArrayList<Property> findProperty(int municipalityNumber, int lotNumber,
      int sectionNumber) {
    ArrayList<Property> foundProperty = new ArrayList<>();
    String propertyId = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    boolean propertyExists = false;

    if (municipalityNumber < 0 || municipalityNumber > 5054 || lotNumber < 0 || sectionNumber < 0) {
      throw new IllegalArgumentException(
          "Invalid property id. Values must be positive. Municipality number must be between 101 and 5054");
    } else {
      for (Property property : properties) {
        if (property.getPropertyId().equals(propertyId)) {
          Property propertyCopy = new Property(property);
          foundProperty.add(propertyCopy);
          propertyExists = true;
        }
      }
      if (!propertyExists) {
        throw new IllegalArgumentException("Property does not exist");
      }
    }
    return foundProperty;
  }

  /**
   * This method is used to find all the properties in a given municipality.
   *
   * @param municipalityNumber The municipality number of the property.
   *
   * @return The properties if found, otherwise throws an IllegalArgumentException.
   */
  public ArrayList<Property> getPropertiesByMunicipalityNumber(int municipalityNumber) {
    ArrayList<Property> list = new ArrayList<>();
    for (Property property : properties) {
      if (property.getMunicipalityNumber() == municipalityNumber) {
        Property propertiesCopy = new Property(property);
        list.add(propertiesCopy);
      }
    }
    return list;
  }

  /**
   * This method is used to find all the properties with a given lot number.
   *
   * @param lotNumber The lot number of the property.
   *
   * @return The properties if found, otherwise throws an IllegalArgumentException.
   */
  public ArrayList<Property> getPropertiesByLotNumber(int lotNumber) {
    ArrayList<Property> list = new ArrayList<>();
    for (Property property : properties) {
      if (property.getLotNumber() == lotNumber) {
        Property propertiesCopy = new Property(property);
        list.add(propertiesCopy);
      }
    }
    return list;
  }

  /**
   * This method is used to find the average area of all the properties in the register.
   *
   * @return The average area of all the properties in the register.
   */
  public double getAverageArea() {
    double sum = 0;
    for (Property property : properties) {
      sum += property.getArea();
    }
    return sum / properties.size();
  }

  /**
   * This method is used to find the Owner of a property.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   *
   * @return The owner of the property.
   */
  public String getOwnerOfProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
    String propertyId = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    boolean propertyExists = false;
    String nameOfOwner = null;

    if (municipalityNumber < 0 || municipalityNumber > 5054 || lotNumber < 0 || sectionNumber < 0) {
      throw new IllegalArgumentException(
          "Invalid property id. Values must be positive. Municipality number must be between 101 and 5054");
    } else {
      for (Property property : properties) {
        if (property.getPropertyId().equals(propertyId)) {
          nameOfOwner = property.getNameOfOwner();
          propertyExists = true;
        }
      }
      if (!propertyExists) {
        throw new IllegalArgumentException("Property does not exist");
      }
    }
    return nameOfOwner;
  }

  /**
   * This method is used to change the municipality number of a property.
   *
   * @param municipalityNumber    The municipality number of the property.
   * @param lotNumber             The lot number of the property.
   * @param sectionNumber         The section number of the property.
   * @param newMunicipalityNumber The new municipality number of the property.
   */
  public void changeMunicipalityNumber(int municipalityNumber, int lotNumber, int sectionNumber,
      int newMunicipalityNumber) {
    String propertyId = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    boolean propertyExists = false;

    if (municipalityNumber < 0 || municipalityNumber > 5054 || lotNumber < 0 || sectionNumber < 0) {
      throw new IllegalArgumentException(
          "Invalid property id. Values must be positive. Municipality number must be between 101 and 5054");
    } else {
      for (Property property : properties) {
        if (property.getPropertyId().equals(propertyId)) {
          property.setMunicipalityNumber(newMunicipalityNumber);
          propertyExists = true;
        }
      }
      if (!propertyExists) {
        throw new IllegalArgumentException("Property does not exist");
      }
    }
  }

  /**
   * This method is used to change the municipality name of a property.
   *
   * @param municipalityNumber  The municipality number of the property.
   * @param lotNumber           The lot number of the property.
   * @param sectionNumber       The section number of the property.
   * @param newMunicipalityName The new municipality name of the property.
   */
  public void changeMunicipalityName(int municipalityNumber, int lotNumber, int sectionNumber, String newMunicipalityName) {
    String propertyId = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    boolean propertyExists = false;

    if (municipalityNumber < 101 || municipalityNumber > 5054 || lotNumber < 0 || sectionNumber < 0) {
      throw new IllegalArgumentException(
          "Invalid property id. Values must be positive. Municipality number must be between 101 and 5054");
    } else {
      for (Property property : properties) {
        if (property.getPropertyId().equals(propertyId)) {
          property.setMunicipalityName(newMunicipalityName);
          propertyExists = true;
        }
      }
      if (!propertyExists) {
        throw new IllegalArgumentException("Property does not exist");
      }
    }
  }

  /**
   * This method is used to change the lot name of a property.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   * @param newLotName       The new lot number of the property.
   */
  public void changeLotName(int municipalityNumber, int lotNumber, int sectionNumber, String newLotName) {
    String propertyId = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    boolean propertyExists = false;

    if (municipalityNumber < 101 || municipalityNumber > 5054 || lotNumber < 0 || sectionNumber < 0) {
      throw new IllegalArgumentException(
          "Invalid property id. Values must be positive. Municipality number must be between 101 and 5054");
    } else {
      for (Property property : properties) {
        if (property.getPropertyId().equals(propertyId)) {
          property.setLotName(newLotName);
          propertyExists = true;
        }
      }
      if (!propertyExists) {
        throw new IllegalArgumentException("Property does not exist");
      }
    }
  }

  /**
   * This method is used to change the owner of a property.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   * @param newNameOfOwner     The new owner of the property.
   */
  public void changeNameOfOwner(int municipalityNumber, int lotNumber, int sectionNumber, String newNameOfOwner) {
    String propertyId = municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    boolean propertyExists = false;

    if (municipalityNumber < 101 || municipalityNumber > 5054 || lotNumber < 0 || sectionNumber < 0) {
      throw new IllegalArgumentException(
          "Invalid property id. Values must be positive. Municipality number must be between 101 and 5054");
    } else {
      for (Property property : properties) {
        if (property.getPropertyId().equals(propertyId)) {
          property.setNameOfOwner(newNameOfOwner);
          propertyExists = true;
        }
      }
      if (!propertyExists) {
        throw new IllegalArgumentException("Property does not exist");
      }
    }
  }
}
