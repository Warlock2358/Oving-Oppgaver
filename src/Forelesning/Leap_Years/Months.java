/**
 *

package Forelesning.Leap_Years;

import java.util.Scanner;

public class Months {
    private Leap_Year leapYear = new Leap_Year();

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int Year = Integer.parseInt(in.nextLine());
        in.close();

        for (int i = 1; i <= 12; i++) {
            System.out.println("Month " + i + " has " +  " days.");
        }
        int[] days_months = {31,28,31,30,31,30,31,31,30,31,30,31};
    }
}
 * <p>
 *
 */
