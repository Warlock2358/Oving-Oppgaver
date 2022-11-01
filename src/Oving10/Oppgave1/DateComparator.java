package Oving10.Oppgave1;

import java.util.Comparator;

public class DateComparator implements Comparator<Arrangement> {

  @Override
  public int compare(Arrangement o1, Arrangement o2) {
    return Long.compare(o1.getArrangementDate(), o2.getArrangementDate());
  }
}

