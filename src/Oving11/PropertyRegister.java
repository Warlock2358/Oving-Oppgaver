package Oving11;

import java.util.ArrayList;

public class PropertyRegister {

  private final ArrayList<Property> properties;

  public PropertyRegister() {
    properties = new ArrayList<>();
  }

  public ArrayList<Property> getProperties() {
//    StringBuilder result = new StringBuilder();
//    for (Property property : properties) {
//      result.append(property.toString()).append("\n");
//    }
//    return result.toString();
    ArrayList<Property> list = new ArrayList<>();
    for (Property property : properties) {
      Property propertiesCopy = new Property(property);
      list.add(propertiesCopy);
    }
    return list;
  }

  public void registerProperty(int municipalityNumber, int lotNumber, int sectionNumber,
      String municipalityName, String lotName, String nameOfOwner, double area) {
    Property newProperty = new Property(municipalityNumber, lotNumber, sectionNumber,
        municipalityName, lotName, nameOfOwner, area);
    properties.add(newProperty);
  }

  public void removeProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
    properties.removeIf(property -> property.getMunicipalityNumber() == municipalityNumber
        && property.getLotNumber() == lotNumber
        && property.getSectionNumber() == sectionNumber);
  }

  public int getNumberOfProperties() {
    return properties.size();
  }

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

  public double getAverageArea() {
    double sum = 0;
    for (Property property : properties) {
      sum += property.getArea();
    }
    return sum / properties.size();
  }

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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Property property : properties) {
      sb.append(property.toString());
      sb.append("\n");
    }
    return sb.toString();
  }
}
