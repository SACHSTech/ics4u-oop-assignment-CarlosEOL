package ShoppingCartList;

import ShoppingCartList.ShoppingCart.*;

/*
 * Item.java was to organize the similarities between each inheritance,
 * A polymorphic method.
 */

public class Item extends ShoppingCart{
  
  //Main Value for Item
  String strName; // The Name of the Item
  private String strType; // The type (Electronic, bedroom, bathroom stuff)
  private int intNum; // how many items you going to buy or add into cart
  private int intPrice;
  private boolean buyNow;

  // A blank Constructor
  public Item(){
    this.strName = "*****";
    this.strType = "*****";
    this.intNum = 1;
    this.intPrice = 0;
    this.buyNow = false;
  }
  
  // A default constructor for a type to call upon
  public Item(String Name, String Type, int intNumberOfItem, int Price, boolean buyOption) {
    this.strName = Name;
    this.strType = Type;
    this.intNum = intNumberOfItem;
    this.intPrice = Price;
    this.buyNow = buyOption;
  }

  //Getter methods
  public String getName() {
    return strName;
  }

  public String getType() {
    return strType;
  }

  public int getQuantity() {
    return intNum;
  }

  public boolean getBuyOption() {
    return buyNow;
  }

  public int getPrice() {
    return intPrice;
  }

  //Setter methods
  public void setName(String Name) {
    this.strName = Name;
    System.out.print("Name set to: " + strName);
  }

  public void setPrice(int Price) {
    this.intPrice = Price;
    System.out.print("Price set to: " + intPrice);
  }

  public void setQuantity(int Quantity) {
    this.intNum = Quantity;
    System.out.print("Quantity set to: " + intNum);
  }
}