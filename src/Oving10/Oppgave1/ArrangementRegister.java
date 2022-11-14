package Oving10.Oppgave1;

import java.util.ArrayList;

public class ArrangementRegister {

  private final ArrayList<Arrangement> arrangementList;

  /**
   * Constructor for ArrangementRegister
   */
  public ArrangementRegister() {
    arrangementList = new ArrayList<>();
  }

  /**
   * Adds an arrangement to the arrangementList
   *
   * @param arrangementNr        The number of the arrangement.
   * @param arrangementName      The name of the arrangement.
   * @param arrangementPlace     The place of the arrangement.
   * @param arrangementOrganizer The organizer of the arrangement.
   * @param arrangementType      The type of the arrangement.
   * @param arrangementDate      The date of the arrangement.
   */
  public void addArrangement(int arrangementNr, String arrangementName, String arrangementPlace,
      String arrangementOrganizer, String arrangementType, long arrangementDate) {
    arrangementList.add(
        new Arrangement(arrangementNr, arrangementName, arrangementPlace, arrangementOrganizer,
            arrangementType, arrangementDate));
  }

  /**
   * This method is used to get the arrangementList.
   *
   * @return The arrangementList.
   */
  public ArrayList<Arrangement> getArrangementList() {
    ArrayList<Arrangement> arrangements = new ArrayList<>(arrangementList);
    return arrangements;
  }

  /**
   * This method is used to get all the arrangements for a specific place.
   *
   * @return The arrangementList for a place.
   */
  public ArrayList<Arrangement> getArrangementListForPlace(String arrangementPlace) {
    ArrayList<Arrangement> arrangementListForPlace = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
      if (arrangement.getArrangementPlace().equals(arrangementPlace)) {
        arrangementListForPlace.add(arrangement);
      }
    }
    return arrangementListForPlace;
  }

  /**
   * This method is used to get all the arrangements for a specific date.
   *
   * @return The arrangementList for a date.
   */
  public ArrayList<Arrangement> getArrangementListForDate(long arrangementDate) {
    ArrayList<Arrangement> arrangementListForDate = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
      if (arrangement.getArrangementDate() == arrangementDate) {
        arrangementListForDate.add(arrangement);
      }
    }
    return arrangementListForDate;
  }

  /**
   * This method is used to get all the arrangements between to dates. It also sorts the
   * arrangements by date.
   *
   * @return The arrangementList for all arrangements between to dates.
   */
  public ArrayList<Arrangement> listBetweenDates(long startDate, long endDate) {
    ArrayList<Arrangement> arrangementListBetweenDates = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
      if (arrangement.getArrangementDate() >= startDate
          && arrangement.getArrangementDate() <= endDate) {
        arrangementListBetweenDates.add(arrangement);
      }
    }
    arrangementListBetweenDates.sort(new DateComparator());
    return arrangementListBetweenDates;
  }

  /**
   * This method is used to get all the arrangements and sort them based on the place of each
   * arrangement.
   *
   * @return The arrangementList sorted by place.
   */
  public ArrayList<Arrangement> getListSortedByPlace() {
    ArrayList<Arrangement> arrangementListSortedByPlace = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
//      if (arrangement.getArrangementPlace().equals(arrangementPlace)) {
//        arrangementListSortedByPlace.add(arrangement);
//      }
      arrangementListSortedByPlace.add(arrangement);
    }
    arrangementListSortedByPlace.sort(new PlaceComparator());
    return arrangementListSortedByPlace;
  }

  /**
   * This method is used to get all the arrangements and sort them based on the type of each
   * arrangement.
   *
   * @return The arrangementList sorted by type.
   */
  public ArrayList<Arrangement> getListSortedByType() {
    ArrayList<Arrangement> arrangementListSortedByType = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
//      if (arrangement.getArrangementType().equals(arrangementType)) {
//        arrangementListSortedByType.add(arrangement);
//      }
      arrangementListSortedByType.add(arrangement);
    }
    arrangementListSortedByType.sort(new TypeComparator());
    return arrangementListSortedByType;
  }

  /**
   * This method is used to get all the arrangements and sort them based on the date of each
   * arrangement.
   *
   * @return The arrangementList sorted by date.
   */
  public ArrayList<Arrangement> getListSortedByDate() {
    ArrayList<Arrangement> arrangementListSortedByDate = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
//      if (arrangement.getArrangementType().equals(arrangementDate)) {
//        arrangementListSortedByDate.add(arrangement);
//      }
      arrangementListSortedByDate.add(arrangement);
    }
    arrangementListSortedByDate.sort(new DateComparator());
    return arrangementListSortedByDate;
  }
}
