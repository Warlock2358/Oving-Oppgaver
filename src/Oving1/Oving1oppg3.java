package Oving1;

import static javax.swing.JOptionPane.*;

public class Oving1oppg3 {
    public static void main(String[] args){
        String in = showInputDialog("Antall sekunder");
        int inputSek = Integer.parseInt(in);

        int time = inputSek / (3600);
        int timeRest = inputSek%3600; //Easier to use modulus
        int minutt = timeRest/60;
        //int minutt = (inputSek - (time * 3600)) / 60;
        int sek = timeRest%60; //Easier to use modulus
        //int sek = inputSek - (time * 3600) - (minutt * 60);

        showMessageDialog(null,inputSek + " sekunder er lik " + time + " timer " + minutt + " minutter og " + sek + " sekunder.");
    }
}
