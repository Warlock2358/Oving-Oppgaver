package Oving1;

import static javax.swing.JOptionPane.*;

public class Oving1oppg2 {
    public static void main(String[] args) {
        String timerLest = showInputDialog("Antall timer: ");
        String minutterLest = showInputDialog("Antall minutter: ");
        String sekundeLest = showInputDialog("Antall sekunder: ");

        double timer = Double.parseDouble(timerLest);
        double minutter = Double.parseDouble(minutterLest);
        double sekunder = Double.parseDouble(sekundeLest);
        double antallsekunder = timer*(60*60) + minutter*(60) + sekunder;

        showMessageDialog(null, "Antall sekunder er: " + antallsekunder);
    }
}
