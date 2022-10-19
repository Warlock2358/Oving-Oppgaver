package Oving7.Oppgave2;

import java.util.*;

public class Oppg2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Tast 1 for å behandle en tekst, tast 2 for å avslutte");
            int valg = in.nextInt();

            if (valg == 1) {
                visMeny();
            } else if (valg == 2) {
                System.out.println("Programmet avsluttes");
                break;
            } else {
                System.out.println("Ugyldig valg, prøv igjen");
            }

        }
        in.close();
        System.exit(1);
    }

    public static void visMeny() {
        in.nextLine();
        System.out.println("Skriv inn en tekst");
        String input = in.nextLine();

        TekstBehandling a = new TekstBehandling(input);

        System.out.println("Tast 1 for å finne antall ord i teksten");
        System.out.println("Tast 2 for å finne gjennomsnittlig ordlengde");
        System.out.println("Tast 3 for å finne gjennomsnittlig antall ord i en setning");
        System.out.println("Tast 4 for å bytte ut et ord i teksten med et annet ord");
        System.out.println("Tast 5 for å få orginalteksten");
        System.out.println("Tast 6 for å gjøre alle bokstaver til store bokstaver");

        int valg = in.nextInt();

        switch (valg) {
            case 1 -> System.out.println("Antall ord i teksten er: " + a.antallOrd());
            case 2 -> System.out.println("Gjennomsnittlig ordlengde er: " + a.gjenOrdLengde());
            case 3 -> System.out.println("Gjennomsnittlig antall ord i en setning er: " + a.gjenAntallOrd());
            case 4 -> {
                System.out.println("Skriv inn ordet du vil bytte ut");
                in.nextLine();
                String ord1 = in.nextLine();
                System.out.println("Skriv inn ordet du vil bytte med");
                String ord2 = in.nextLine();
                System.out.println("Teksten med byttet ord er: " + a.bytteOrd(ord1, ord2));
            }
            case 5 -> System.out.println("Orginalteksten er: " + a.orgiTekst());
            case 6 -> System.out.println("Teksten med store bokstaver er: " + a.storBokstav());
            default -> System.out.println("Ugyldig valg, prøv igjen");
        }
    }
}

