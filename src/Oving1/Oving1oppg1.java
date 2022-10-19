package Oving1;

import java.util.Scanner; // Importerer Scanner klassen

public class Oving1oppg1 {
    public static void main(String[] args){
        Scanner inch = new Scanner(System.in); // Lager et Scanner objekt
        System.out.println("Tast inn tommer");
        //double tom = Double.parseDouble(inch.nextLine()); // Leser brukerens input
        double tom = inch.nextDouble();
        double centi = tom * 2.54; //
        System.out.println("Antall tommer " + tom + " er " + centi + " centimeter");
    }
}
