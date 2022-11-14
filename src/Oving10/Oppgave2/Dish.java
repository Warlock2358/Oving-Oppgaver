package Oving10.Oppgave2;

public class Dish {

  private final String name;
  private int price;
  private final String type;
  private String description;

  /**
   * This constructor creates a Dish object.
   *
   * @param name        The name of the dish.
   * @param price       The price of the dish.
   * @param type        The type of the dish. (Main course, side dish, dessert)
   * @param description The description of the dish.
   */
  public Dish(String name, int price, String type, String description) {
    this.name = name;
    this.price = price;
    this.type = type;
    this.description = description;
  }

  /**
   * This get method is used to fetch the name of the dish.
   *
   * @return The name of the dish.
   */
  public String getName() {
    return name;
  }

  /**
   * This get method is used to fetch the price of the dish.
   *
   * @return The price of the dish.
   */
  public int getPrice() {
    return price;
  }

  /**
   * This get method is used to fetch the type of the dish.
   *
   * @return The type of the dish.
   */
  public String getType() {
    return type;
  }

  /**
   * This get method is used to fetch the description of the dish.
   *
   * @return The description of the dish.
   */
  public String getDescription() {
    return description;
  }

  /**
   * This set method is used to set the price of the dish.
   *
   * @param price The price of the dish.
   */
  public void setPrice(int price) {
    this.price = price;
  }

  /**
   * This set method is used to set the description of the dish.
   *
   * @param description The description of the dish.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * This method is used to override the toString method. So that the object can be printed out in a
   * readable format.
   */
  @Override
  public String toString() {
    return """
        \nDish name: %s
        Dish price: %d
        Dish type: %s
        Dish description: %s
        """.formatted(name, price, type, description);
  }

  /**
   * This method is used to make a small string of the dish. This is used in the Menu class.
   */
  public String toSmallString() {
    return """
        \nDish name: %s
        Dish price: %d kr
        """.formatted(name, price);
  }
}
