package Oving10.Oppgave1;

import java.util.ArrayList;

public class ArrangementRegister {
  private ArrayList<Arrangement> arrangementList;

  public ArrangementRegister() {
    arrangementList = new ArrayList<>();
  }
  public void addArrangement(int arrangementNr, String arrangementName, String arrangementPlace,
      String arrangementOrganizer, String arrangementType, long arrangementDate) {
    arrangementList.add(new Arrangement(arrangementNr, arrangementName, arrangementPlace, arrangementOrganizer, arrangementType, arrangementDate));
  }

  public ArrayList<Arrangement> getArrangementListForPlace(String arrangementPlace) {
    ArrayList<Arrangement> arrangementListForPlace = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
      if (arrangement.getArrangementPlace().equals(arrangementPlace)) {
        arrangementListForPlace.add(arrangement);
      }
    }
    return arrangementListForPlace;
  }

  public ArrayList<Arrangement> getArrangementListForDate(long arrangementDate) {
    ArrayList<Arrangement> arrangementListForDate = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
      if (arrangement.getArrangementDate() == arrangementDate) {
        arrangementListForDate.add(arrangement);
      }
    }
    return arrangementListForDate;
  }

  public ArrayList<Arrangement> listBetweenDates(long startDate, long endDate) {
    ArrayList<Arrangement> arrangementListBetweenDates = new ArrayList<>();
    for (Arrangement arrangement : arrangementList) {
      if (arrangement.getArrangementDate() >= startDate && arrangement.getArrangementDate() <= endDate) {
        arrangementListBetweenDates.add(arrangement);
      }
    }
    return arrangementListBetweenDates;
  }

  public void placeSort() {
    PlaceComparator placeComparator = new PlaceComparator();
    arrangementList.sort(placeComparator);
  }

  public void typeSort() {
    TypeComparator typeComparator = new TypeComparator();
    arrangementList.sort(typeComparator);
  }

  public void dateSort() {
    DateComparator dateComparator = new DateComparator();
    arrangementList.sort(dateComparator);
  }
}
