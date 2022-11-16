package Oving11;

/**
 * A class representing a property.
 *
 * @author Isak Mandal
 */
public class Property {

  private int municipalityNumber;
  private final int lotNumber;
  private final int sectionNumber;
  private String municipalityName;
  private String lotName;
  private String nameOfOwner;
  private final double area;

  /**
   * Constructor for Property, containing all the information about a property.
   *
   * @param municipalityNumber The municipality number of the property.
   * @param lotNumber          The lot number of the property.
   * @param sectionNumber      The section number of the property.
   * @param municipalityName   The municipality name of the property.
   * @param lotName            The lot name of the property.
   * @param nameOfOwner        The name of the owner of the property.
   * @param area               The area of the property in m^2.
   */
  public Property(int municipalityNumber, int lotNumber, int sectionNumber, String municipalityName,
      String lotName, String nameOfOwner, double area) {
    testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName,
        nameOfOwner); // Try catch in user interface
    this.municipalityNumber = municipalityNumber;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.municipalityName = municipalityName;
    this.lotName = lotName;
    this.nameOfOwner = nameOfOwner;
    this.area = area;
  }

  /**
   * This is a secondary constructor for Property, containing all the information about a property.
   * Used to create deep copies of properties.
   *
   * @param property The property to be copied.
   */
  public Property(Property property) {
    this.municipalityNumber = property.municipalityNumber;
    this.lotNumber = property.lotNumber;
    this.sectionNumber = property.sectionNumber;
    this.municipalityName = property.municipalityName;
    this.lotName = property.lotName;
    this.nameOfOwner = property.nameOfOwner;
    this.area = property.area;
  }

  /**
   * A method to test the values of the variables.
   *
   * @param municipalityNumber The municipality number of the property. Must be between 101 and 5054.
   * @param lotNumber          The lot number of the property. Must be between 1 and 9999.
   * @param sectionNumber      The section number of the property. Must be between 1 and 9999.
   * @param area               The area of the property in m^2. Must be between 1 and 1000000.
   * @param municipalityName   The municipality name of the property. Must be between 1 and 20
   * @param nameOfOwner        The name of the owner of the property. Must be between 1 and 20
   */
  public void testValues(int municipalityNumber, int lotNumber, int sectionNumber, double area,
      String municipalityName, String nameOfOwner) {
    if (municipalityNumber < 101 || municipalityNumber > 5054) {
      throw new IllegalArgumentException("Municipality number must be between 101 and 5054");
    }
    if (lotNumber < 0 || lotNumber > 9999) {
      throw new IllegalArgumentException("Lot number must be between 0 and 999");
    }
    if (sectionNumber < 0 || sectionNumber > 9999) {
      throw new IllegalArgumentException("Section number must be between 0 and 999");
    }
    if (area < 0) {
      throw new IllegalArgumentException("Area must be positive");
    }
    if (municipalityName == null || municipalityName.isBlank()) {
      throw new IllegalArgumentException("Municipality name must be a string");
    }
    if (nameOfOwner == null || nameOfOwner.isBlank()) {
      throw new IllegalArgumentException("Name of owner must be a string");
    }
  }

  /**
   * A method to get the municipality number of the property.
   *
   * @return The municipality number of the property.
   */
  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  /**
   * A method to get the lot number of the property.
   *
   * @return The lot number of the property.
   */
  public int getLotNumber() {
    return lotNumber;
  }

  /**
   * A method to get the section number of the property.
   *
   * @return The section number of the property.
   */
  public int getSectionNumber() {
    return sectionNumber;
  }

  /**
   * A method to get the municipality name of the property.
   *
   * @return The municipality name of the property.
   */
  public String getMunicipalityName() {
    return municipalityName;
  }

  /**
   * A method to get the lot name of the property.
   *
   * @return The lot name of the property.
   */
  public String getLotName() {
    return lotName;
  }

  /**
   * A method to get the name of the owner of the property.
   *
   * @return The name of the owner of the property.
   */
  public String getNameOfOwner() {
    return nameOfOwner;
  }

  /**
   * A method to get the area of the property.
   *
   * @return The area of the property.
   */
  public double getArea() {
    return area;
  }

  /**
   * A method to set the municipality number of the property.
   *
   * @param municipalityNumber The municipality number of the property.
   */
  public void setMunicipalityNumber(int municipalityNumber) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.municipalityNumber = municipalityNumber;
  }

  /**
   * A method to set the municipality name of the property.
   *
   * @param municipalityName The municipality name of the property.
   */
  public void setMunicipalityName(String municipalityName) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.municipalityName = municipalityName;
  }

  /**
   * A method to set the lot name of the property.
   *
   * @param lotName The lot name of the property.
   */
  public void setLotName(String lotName) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.lotName = lotName;
  }

  /**
   * A method to set the name of the owner of the property.
   *
   * @param nameOfOwner The name of the owner of the property.
   */
  public void setNameOfOwner(String nameOfOwner) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.nameOfOwner = nameOfOwner;
  }

  /**
   * This method is used to make an identifier for the property.
   *
   * @return The property id for the property in string format.
   */
  public String getPropertyId() {
    return this.getMunicipalityNumber() + "-" + this.getLotNumber() + "/" + this.getSectionNumber();
  }

  /**
   * This method is used to make a string representation of the property.
   *
   * @return The string representation of the property.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n").append("Municipality: ").append(this.getMunicipalityName()).append("\n")
        .append("Property id: ").append(this.getPropertyId()).append("\n")
        .append("Area: ").append(this.getArea()).append("m^2").append("\n").append("Owner: ")
        .append(this.getNameOfOwner());
    if (this.getLotName().equals("")) {
      return sb.append("\n").toString();
    } else {
      return sb.append("\n").append("Lot name: ").append(this.getLotName()).append("\n").toString();
    }
  }
}
