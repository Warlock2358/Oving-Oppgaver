package Oving10.Oppgave2;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

  public Scanner in = new Scanner(System.in);
  public MenuRegister menuRegister = new MenuRegister();

  @SuppressWarnings("InfiniteLoopStatement")
  public static void main(String[] args) {
    Client client = new Client();
    client.testData();

    while (true) {
      client.printMenu();
    }
  }

  public void testData() {
    menuRegister.registerNewDish("Chicken", 100, "Main", "Chicken with rice");
    menuRegister.registerNewDish("Pulled pork", 200, "Main", "Pulled pork with barbeque sauce");
    menuRegister.registerNewDish("Salad", 75, "Side", "Salad with dressing");
    menuRegister.registerNewDish("Fries", 20, "Side", "Fries with ketchup");
    menuRegister.registerNewDish("Ice cream", 50, "Dessert", "Ice cream with chocolate sauce");
    menuRegister.registerNewDish("Cake", 150, "Dessert", "Cake with whipped cream");
  }

  public void printMenu() {
    System.out.println("---");
    System.out.println("1. Register new dish");
    System.out.println("2. Register new menu");
    System.out.println("3. Get all menus");
    System.out.println("4. Get all dishes");
    System.out.println("5. Get dishes by name");
    System.out.println("6. Get dishes by type");
    System.out.println("7. Get menus with price interval");
    System.out.println("8. Exit");
    System.out.print("Choose an option: ");
    int option = in.nextInt();
    in.nextLine();
    System.out.println();

    switch (option) {
      case 1 -> registerNewDish();
      case 2 -> registerNewMenu();
      case 3 -> getAllMenus();
      case 4 -> getAllDishes();
      case 5 -> {
        System.out.print("Enter name: ");
        String name = in.nextLine();
        findDishesByName(name);
      }
      case 6 -> {
        System.out.print("Enter type: ");
        String type = in.nextLine();
        findDishesByType(type);
      }
      case 7 -> getMenusWithPriceInterval();
      case 8 -> {
        System.out.println("Exiting...");
        System.exit(0);
      }
      default -> System.out.println("Invalid option");
    }
  }


  public void registerNewDish() {
    System.out.print("Name: ");
    String name = in.nextLine();
    if (menuRegister.getDishesByName(name).size() > 0) {
      System.out.println("A dish with that name already exists");
    } else {
      System.out.print("Price: ");
      int price = in.nextInt();
      in.nextLine();
      System.out.print("Type: ");
      String type = in.nextLine();
      System.out.print("Description: ");
      String description = in.nextLine();
      System.out.println();

      Dish newDish = menuRegister.registerNewDish(name, price, type, description);
      System.out.println("New dish registered:");
      System.out.println(newDish.toString());
    }
  }

  public void findDishesByName(String name) {
    ArrayList<Dish> dishesByName = menuRegister.getDishesByName(name);
    if (dishesByName.size() > 0) {
      System.out.println("Dishes with name " + name + ":");
      for (Dish dish : dishesByName) {
        System.out.println(dish.toString());
      }
    } else {
      System.out.println("No dishes with name " + name);
    }
  }

  public void getAllMenus() {
    ArrayList<Menu> menus = menuRegister.getMenuList();
    for (Menu menu : menus) {
      System.out.println(menu);
    }
  }

  public void getAllDishes() {
    ArrayList<Dish> dishes = menuRegister.getDishList();
    for (Dish dish : dishes) {
      System.out.println(dish);
    }
  }

  public void findDishesByType(String type) {
    ArrayList<Dish> dishesByType = menuRegister.getDishesByType(type);
    if (dishesByType.size() > 0) {
      System.out.println("Dishes with type " + type + ":");
      for (Dish dish : dishesByType) {
        System.out.println(dish.toString());
      }
    } else {
      System.out.println("No dishes with type " + type);
    }
  }

  public void registerNewMenu() {
    System.out.println("Enter menu name: ");
    String menuName = in.nextLine();
    System.out.println("Enter dishes to add to menu (enter 0 to finish):");
    ArrayList<Dish> dishes = new ArrayList<>();
    String name;
    while (true) {
      System.out.print("Dish name: ");
      name = in.nextLine();
      if (name.equals("0")) {
        break;
      }
      ArrayList<Dish> dishesByName = menuRegister.getDishesByName(name);
      if (dishesByName.size() > 0) {
        dishes.add(dishesByName.get(0));
        System.out.println(name + "was added to the menu");
      } else {
        System.out.println("No dishes with name " + name);
      }
    }
    System.out.println();

    menuRegister.registerNewMenu(menuName);
    System.out.println("New menu registered:");
    System.out.println(dishes);
  }

  public void getMenusWithPriceInterval() {
    System.out.print("Min price: ");
    int minPrice = in.nextInt();
    in.nextLine();
    System.out.print("Max price: ");
    int maxPrice = in.nextInt();
    in.nextLine();
    ArrayList<Menu> menusWithPriceInterval = menuRegister.getMenusWithPriceInterval(minPrice,
        maxPrice);
    if (menusWithPriceInterval.size() > 0) {
      System.out.println("Menus with price between " + minPrice + " and " + maxPrice + ":");
      for (Menu menu : menusWithPriceInterval) {
        System.out.println(menu.toString());
      }
    } else {
      System.out.println("No menus with price between " + minPrice + " and " + maxPrice);
    }
  }
}
