package Oving10.Oppgave1;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrangementRegister> arrangementRegisterList = new ArrayList<>();
    while (true) {
      System.out.println("1. Add arrangement");
      System.out.println("2. List all arrangements");
      System.out.println("3. List all arrangements for place");
      System.out.println("4. List all arrangements for date");
      System.out.println("5. List all arrangements between two dates");
      System.out.println("6. List all arrangements by place");
      System.out.println("7. List all arrangements by type");
      System.out.println("8. List all arrangements by date");
      System.out.println("9. Exit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1 -> {
//          System.out.print("Arrangement number: ");
//          int arrangementNr = scanner.nextInt();
//          scanner.nextLine();
//          System.out.print("Arrangement name: ");
//          String name = scanner.nextLine();
//          System.out.print("Arrangement place: ");
//          String place = scanner.nextLine();
//          System.out.print("Arrangement organizer: ");
//          String organizer = scanner.nextLine();
//          System.out.print("Arrangement type: ");
//          String type = scanner.nextLine();
//          System.out.print("Arrangement date: ");
//          long date = scanner.nextLong();
//          scanner.nextLine();
//          ArrangementRegister arrangementRegister = new ArrangementRegister();
//          arrangementRegister.addArrangement(arrangementNr, name, place, organizer, type, date);
          ArrangementRegister arrangementRegister = new ArrangementRegister();
          arrangementRegister.addArrangement(1, "Arrangement 1", "lll", "Organizer 1", "Type 2", 1);
          arrangementRegister.addArrangement(1, "Arrangement 2", "zzz", "Organizer 1", "Type 5", 6);
          arrangementRegister.addArrangement(1, "Arrangement 3", "aaa", "Organizer 1", "Type 1", 8);
          arrangementRegister.addArrangement(1, "Arrangement 4", "bbb", "Organizer 1", "Type 0", 3);
          arrangementRegister.addArrangement(1, "Arrangement 5", "ccc", "Organizer 1", "Type 3", 10);
          arrangementRegisterList.add(arrangementRegister);
        }
        case 2 -> {
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.getArrangementList());
          }
        }
        case 3 -> {
          System.out.print("Arrangement place: ");
          String place = scanner.nextLine();
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.getArrangementListForPlace(place));
          }
        }
        case 4 -> {
          System.out.println("Arrangement date: ");
          System.out.println("Example: 200212120912");
          long date = scanner.nextLong();
          scanner.nextLine();
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.getArrangementListForDate(date));
          }
        }
        case 5 -> {
          System.out.println("Start date: ");
          System.out.println("Example: 200212120912");
          long startDate = scanner.nextLong();
          scanner.nextLine();
          System.out.println("End date: ");
          System.out.println("Example: 201212120918");
          long endDate = scanner.nextLong();
          scanner.nextLine();
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.listBetweenDates(startDate, endDate));
          }
        }
        case 6 -> {
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.getListSortedByPlace());
          }
        }
        case 7 -> {
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.getListSortedByType());
          }
        }
        case 8 -> {
          for (ArrangementRegister arrangementRegister : arrangementRegisterList) {
            System.out.println(arrangementRegister.getListSortedByDate());
          }
        }
        case 9 -> {
          System.out.println("Exiting...");
          System.exit(0);
        }
      }
    }
  }
}
