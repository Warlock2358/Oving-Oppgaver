package Oving11;

import java.util.ArrayList;

public class PropertyRegister {

  private ArrayList<Property> properties;

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
  }

  public void removeProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
    properties.removeIf(property -> property.getMunicipalityNumber() == municipalityNumber
        && property.getLotNumber() == lotNumber
        && property.getSectionNumber() == sectionNumber);
  }

  public ArrayList<Property> getPropertiesByMunicipality(String municipalityName) {
    ArrayList<Property> list = new ArrayList<>();
    for (Property property : properties) {
      if (property.getMunicipalityName().equals(municipalityName)) {
        Property propertiesCopy = new Property(property);
        list.add(propertiesCopy);
      }
    }
    return list;
  }
}
