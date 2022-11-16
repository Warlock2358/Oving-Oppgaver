package Oving11;

public class Property {

  private int municipalityNumber;
  private final int lotNumber;
  private final int sectionNumber;
  private String municipalityName;
  private String lotName;
  private String nameOfOwner;
  private final double area;

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

  public Property(Property property) {
    this.municipalityNumber = property.municipalityNumber;
    this.lotNumber = property.lotNumber;
    this.sectionNumber = property.sectionNumber;
    this.municipalityName = property.municipalityName;
    this.lotName = property.lotName;
    this.nameOfOwner = property.nameOfOwner;
    this.area = property.area;
  }

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

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public String getLotName() {
    return lotName;
  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public double getArea() {
    return area;
  }

  public void setMunicipalityNumber(int municipalityNumber) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.municipalityNumber = municipalityNumber;
  }

  public void setMunicipalityName(String municipalityName) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.municipalityName = municipalityName;
  }

  public void setLotName(String lotName) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.lotName = lotName;
  }

  public void setNameOfOwner(String nameOfOwner) {
    try {
      testValues(municipalityNumber, lotNumber, sectionNumber, area, municipalityName, nameOfOwner);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    this.nameOfOwner = nameOfOwner;
  }

  public String getPropertyId() {
    return this.getMunicipalityNumber() + "-" + this.getLotNumber() + "/" + this.getSectionNumber();
  }

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
