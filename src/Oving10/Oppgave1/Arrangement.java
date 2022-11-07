package Oving10.Oppgave1;

public class Arrangement implements Comparable<Arrangement> {

  private final int arrangementNr;
  private final String arrangementName;
  private final String arrangementPlace;
  private final String arrangementOrganizer;
  private final String arrangementType;
  private final long arrangementDate;

  /**
   * This constructor creates an Arrangement object.
   *
   * @param arrangementNr        The number of the arrangement.
   * @param arrangementName      The name of the arrangement.
   * @param arrangementPlace     The place of the arrangement.
   * @param arrangementOrganizer The organizer of the arrangement.
   * @param arrangementType      The type of the arrangement.
   * @param arrangementDate      The date of the arrangement.
   */
  public Arrangement(int arrangementNr, String arrangementName, String arrangementPlace,
      String arrangementOrganizer, String arrangementType, long arrangementDate) {
    this.arrangementNr = arrangementNr;
    this.arrangementName = arrangementName;
    this.arrangementPlace = arrangementPlace;
    this.arrangementOrganizer = arrangementOrganizer;
    this.arrangementType = arrangementType;
    this.arrangementDate = arrangementDate;
  }

  /**
   * This get method is used to fetch the arrangement place.
   *
   * @return The place of the arrangement.
   */
  public String getArrangementPlace() {
    return arrangementPlace;
  }

  /**
   * This get method is used to fetch the arrangement type.
   *
   * @return The type of the arrangement.
   */
  public String getArrangementType() {
    return arrangementType;
  }

  /**
   * This get method is used to fetch the arrangement date.
   *
   * @return The date of the arrangement.
   */
  public long getArrangementDate() {
    return arrangementDate;
  }

  /**
   * This method is used to override the toString method. So that the object can be printed out in a
   * readable format.
   */
  @Override
  public String toString() {
    return """
        Arrangement information:
        Arrangement number: %d
        Arrangement name: %s
        Arrangement place: %s
        Arrangement organizer: %s
        Arrangement type: %s
        Arrangement date: %d
        """.formatted(arrangementNr, arrangementName, arrangementPlace, arrangementOrganizer,
        arrangementType, arrangementDate);
  }

  @Override
  public int compareTo(Arrangement o) {
    return Integer.compare(arrangementNr, o.arrangementNr);
  }
}
