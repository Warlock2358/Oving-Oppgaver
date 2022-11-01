package Oving10.Oppgave1;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Arrangement> arrangementList = new ArrayList<>();
      boolean running = true;
      while (running) {
        System.out.println("1. Add arrangement");
        System.out.println("2. List all arrangements");
        System.out.println("3. List all arrangements by date");
        System.out.println("4. List all arrangements by type");
        System.out.println("5. List all arrangements by place");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        switch (choice) {
          case 1:
            System.out.print("Arrangement number: ");
            int arrangementNr = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Arrangement name: ");
            String name = scanner.next();
            System.out.print("Arrangement place: ");
            String place = scanner.next();
            System.out.print("Arrangement organizer: ");
            String organizer = scanner.next();
            System.out.print("Arrangement type: ");
            String type = scanner.next();
            System.out.print("Arrangement date: ");
            long date = scanner.nextLong();
            Arrangement arrangement = new Arrangement(arrangementNr, name, place, organizer, type, date);
            arrangementList.add(arrangement);
            break;
          case 2:
            for (Arrangement arrangement1 : arrangementList) {
              System.out.println(arrangement1);
            }
            break;
          case 3:
            arrangementList.sort(new DateComparator());
            for (Arrangement arrangement1 : arrangementList) {
              System.out.println(arrangement1);
            }
            break;
          case 4:
            arrangementList.sort(new TypeComparator());
            for (Arrangement arrangement1 : arrangementList) {
              System.out.println(arrangement1);
            }
            break;
          case 5:
            arrangementList.sort(new PlaceComparator());
            for (Arrangement arrangement1 : arrangementList) {
              System.out.println(arrangement1);
            }
            break;
          case 6:
            running = false;
            break;
          default:
            System.out.println("Invalid input");
            break;
        }
      }
    }

}
