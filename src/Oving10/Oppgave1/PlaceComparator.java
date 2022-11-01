package Oving10.Oppgave1;

import java.util.Comparator;

public class PlaceComparator implements Comparator<Arrangement> {

  @Override
  public int compare(Arrangement o1, Arrangement o2) {
    return o1.getArrangementPlace().compareTo(o2.getArrangementPlace());
  }
}
