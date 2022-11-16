package Oving11;

public enum Choice {
  GET_PROPERTIES(1, "Get all properties"),
  REGISTER_PROPERTY(2, "Register property"),
  REMOVE_PROPERTY(3, "Remove property"),
  GET_NUMBER_OF_PROPERTIES(4, "Get number of properties"),
  FIND_PROPERTY(5, "Find property"),
  GET_PROPERTIES_BY_MUNICIPALITY_NUMBER(6, "Get properties by municipality"),
  GET_PROPERTIES_BY_LOT_NUMBER(7, "Get properties by lot number"),
  GET_AVERAGE_AREA(8, "Get average area"),
  GET_OWNER_OF_PROPERTY(9, "Get owner of property"),
  CHANGE_MUNICIPALITY_NUMBER(10, "Change municipality number"),
  CHANGE_MUNICIPALITY_NAME(11, "Change municipality name"),
  CHANGE_LOT_NAME(12, "Change lot name"),
  CHANGE_OWNER_NAME(13, "Change owner name"),
  EXIT(14, "Exit");

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
