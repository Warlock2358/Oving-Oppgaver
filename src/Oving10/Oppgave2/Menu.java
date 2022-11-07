package Oving10.Oppgave2;

import java.util.ArrayList;

public class Menu {
  private final ArrayList<Dish> dishes;

  private final String name;

  /**
   * This constructor creates a Menu object.
   */
  public Menu(String name) {
    this.name = name;
    this.dishes = new ArrayList<>();
  }

  /**
   * This get method is used to fetch the dishes of the menu.
   *
   * @return The dishes of the menu.
   */
  public ArrayList<Dish> getMenuDishes() {
    return dishes;
  }

  /**
   * This method is used to get the total price of the menu.
   *
   * @return The total price of the menu.
   */
  public double getTotalPrice() {
    double price = 0;
    for (int i = 0; i < getMenuDishes().size(); i++) {
      price = price + getMenuDishes().get(i).getPrice();
    }
    return price;
  }

  /**
   * This get method is used to fetch the name of the menu.
   *
   * @return The name of the menu.
   */
  public String getName() {
    return name;
  }

  /**
   * This method is used to make a string of the menu.
   *
   * @return The string of the menu.
   */
  public String toString() {
    StringBuilder menuDishes = new StringBuilder();
    for (int i = 0; i < getMenuDishes().size(); i++) {
      if (i != 0) {
        menuDishes.append(", ");
      }
      menuDishes.append(getMenuDishes().get(i).toSmallString());
    }
    menuDishes.append("\nTotalPris: ").append(getTotalPrice());
    return menuDishes.toString();
  }
}