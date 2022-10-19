package Oving7.Oppgave2;

public class TekstBehandling {
    private final String stil;

    public TekstBehandling(String tekst) {
        this.stil = tekst;
    }

    public int antallOrd() {
        String[] ord = stil.split(" ");
        return ord.length;
    }

    public int gjenOrdLengde() { // gjennomsnittlig ordlengde
        String[] ord = stil.split(" ");
        for (int i = 0; i < ord.length; i++) {
            ord[i] = ord[i].replaceAll("[?,.!{}()';:+-]", "");
        }
        int antallOrd = ord.length;
        int antallBokstaver = 0;
        for (String s : ord) {
            antallBokstaver += s.length();
        }
        return antallBokstaver / antallOrd;
    }

    /**
     *
     * @return gennomsnittlig antall ord i en setning
     */
    public int gjenAntallOrd() { // gjennomsnittlig antall ord i en setning
        String[] setninger = stil.split("[?,.!{}()';:+-]");
        int antallSetninger = setninger.length;
        int antallOrd = antallOrd();

        return antallOrd / antallSetninger;
    }

    public String bytteOrd(String ord1, String ord2) { // bytter ut et ord i teksten med et annet ord
        return stil.replaceAll(ord1, ord2);
    }

    public String orgiTekst() { // returnerer orginalteksten
        return stil;
    }

    public String storBokstav() { // gjør alle bokstaver til store bokstaver
        return stil.toUpperCase();
    }
}

