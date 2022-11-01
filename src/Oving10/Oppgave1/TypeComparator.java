package Oving10.Oppgave1;

import java.util.Comparator;

public class TypeComparator implements Comparator<Arrangement> {

  @Override
  public int compare(Arrangement o1, Arrangement o2) {
    return o1.getArrangementType().compareTo(o2.getArrangementType());
  }
}
