package Oving10.Oppgave1;

public class Arrangement implements Comparable<Arrangement> {

  private int arrangementNr;
  private String arrangementName;
  private String arrangementPlace;
  private String arrangementOrganizer;
  private String arrangementType;
  private long arrangementDate;

  public Arrangement(int arrangementNr, String arrangementName, String arrangementPlace,
      String arrangementOrganizer, String arrangementType, long arrangementDate) {
    this.arrangementNr = arrangementNr;
    this.arrangementName = arrangementName;
    this.arrangementPlace = arrangementPlace;
    this.arrangementOrganizer = arrangementOrganizer;
    this.arrangementType = arrangementType;
    this.arrangementDate = arrangementDate;
  }

  public String getArrangementPlace() {
    return arrangementPlace;
  }

  public String getArrangementType() {
    return arrangementType;
  }

  public long getArrangementDate() {
    return arrangementDate;
  }

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
