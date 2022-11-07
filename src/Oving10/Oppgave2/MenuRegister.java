package Oving10.Oppgave2;

import java.util.ArrayList;

public class MenuRegister {
  private final ArrayList<Menu> menuList;
  private final ArrayList<Dish> dishList;

  /**
   * This constructor creates a MenuRegister object.
   */
  public MenuRegister() {
    menuList = new ArrayList<>();
    dishList = new ArrayList<>();
  }

  public ArrayList<Menu> getMenuList() {
    return menuList;
  }

  public ArrayList<Dish> getDishList() {
    return dishList;
  }

  public Dish registerNewDish(String name, int price, String type, String description) {
    Dish newDish = new Dish(name, price, type, description);
    dishList.add(newDish);
    return newDish;
  }

  public ArrayList<Dish> getDishesByName(String name) {
    ArrayList<Dish> dishesByName = new ArrayList<>();
    for (Dish dish : dishList) {
      if (dish.getName().equals(name)) {
        dishesByName.add(dish);
      }
    }
    return dishesByName;
  }

  public ArrayList<Dish> getDishesByType(String type) {
    ArrayList<Dish> dishesByType = new ArrayList<>();
    for (Dish dish : dishList) {
      if (dish.getType().equals(type)) {
        dishesByType.add(dish);
      }
    }
    return dishesByType;
  }

  public void registerNewMenu(String name) {
    Menu newMenu = new Menu(name);
    menuList.add(newMenu);
  }

  public ArrayList<Menu> getMenusWithPriceInterval(double minPrice, double maxPrice) {
    ArrayList<Menu> menusWithPriceInterval = new ArrayList<>();
    for (Menu menu : menuList) {
      if (menu.getTotalPrice() >= minPrice && menu.getTotalPrice() <= maxPrice) {
        menusWithPriceInterval.add(menu);
      }
    }
    return menusWithPriceInterval;
  }
}
