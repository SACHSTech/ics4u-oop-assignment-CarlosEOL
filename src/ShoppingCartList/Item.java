/*
 * Item.java was to organize the similarities between each inheritance,
 * A polymorphic method.
 */

public class Item{
  
  //Main Value that other class will call upon
  String strName;
  String strType;
  int intNum;
  boolean buyNow = false;

  // A blanck Constructor
  public Item(){
    this.strName = "*****";
    this.strType = "*****";
    this.intNum = 1;
    this.buyNow = false;
  }

  // A default Constructor of a Item.
  public Item(int NumberOfItem, boolean buyOption) {
    this.strName = "*****";
    this.strType = "*****";
    this.intNum = NumberOfItem;
    this.buyNow = buyOption;
  }
  
  // A default constructor for a type to call upon
  public Item(String Name, String Type, int intNumberOfItem, boolean buyOption) {
    this.strName = Name;
    this.strType = Type;
    this.intNum = intNumberOfItem;
    this.buyNow = buyOption;
  }

  public String getName() {
    return this.strName;
  }
}