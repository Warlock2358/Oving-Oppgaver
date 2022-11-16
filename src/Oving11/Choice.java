package Oving11;

public enum Choice {
  REGISTER_PROPERTY(1, "Register property"),
  REMOVE_PROPERTY(2, "Remove property"),
  GET_PROPERTIES_BY_MUNICIPALITY(3, "Get properties by municipality"),
  GET_ALL_PROPERTIES(4, "Get all properties"),
  EXIT(5, "Exit");

  private final int choiceNumber;
  private final String choiceName;

  Choice(int choiceNumber, String choiceName) {
    this.choiceNumber = choiceNumber;
    this.choiceName = choiceName;
  }

  public int getChoiceNumber() {
    return choiceNumber;
  }

  public String getChoiceName() {
    return choiceName;
  }

  public static Choice getChoice(int choiceNumber) {
    for (Choice choice : Choice.values()) {
      if (choice.getChoiceNumber() == choiceNumber) {
        return choice;
      }
    }
    return null;
  }
}
