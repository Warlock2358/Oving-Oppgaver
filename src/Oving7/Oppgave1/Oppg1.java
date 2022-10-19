package Oving7.Oppgave1;

import java.util.*;

public class Oppg1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Tast 1 for å bruke NyString, tast 2 for å avslutte");
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
        String tekst = input.toLowerCase();

        NyString a = new NyString(tekst);

        System.out.println("Tast 1 for forkorte teksten");
        System.out.println("Tast 2 for å fjerne tegn");
        int valg = in.nextInt();

        switch (valg) {
            case 1 ->
                // System.out.println("Test 1");
                    System.out.println(a.forkort());
            case 2 -> {
                // System.out.println("Test 2");
                System.out.println("Skriv inn tegn som skal fjernes");
                char bokstav = in.next().charAt(0);
                System.out.println(a.fjernTegn(bokstav));
            }
            default -> {
                System.out.println("Ugyldig valg, prøv igjen");
                visMeny();
            }
        }
    }
}

