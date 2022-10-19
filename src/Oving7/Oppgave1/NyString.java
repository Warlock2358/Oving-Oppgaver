package Oving7.Oppgave1;

public final class NyString {
    private final String tekst;

    public NyString(String ord) {
        this.tekst = ord;
    }

    public String forkort() {
        StringBuilder forkortet = new StringBuilder();
        String[] ord = tekst.split(" ");

        for (String s : ord) {
            forkortet.append(s.charAt(0));
        }
        forkortet = new StringBuilder(forkortet.substring(0, 1).toUpperCase() + forkortet.substring(1));
        return forkortet.toString();
    }

    public String fjernTegn(char t) {
        String nyTekst = this.tekst;

        while (nyTekst.indexOf(t) != -1) {
            nyTekst = nyTekst.substring(0, nyTekst.indexOf(t)) + nyTekst.substring(nyTekst.indexOf(t) + 1);
        }
        return nyTekst;
    }
}

