package ShoppingCartList;

import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.FileReader;
import ShoppingCartList.*;

/*
 * Item.java was to organize the similarities between each inheritance,
 * A polymorphic method.
 */

public class Item extends ShoppingCart{
  
  //Main Value for Item
  private String strName; // The Name of the Item
  private String strType; // The type (Electronic, bedroom, bathroom stuff)
  private int intNum; // how many items you going to buy or add into cart
  private double dblPrice;
  private boolean isInCart;
  private boolean buyNow;

  // A blank Constructor
  public Item(){
    this.strName = "*****";
    this.strType = "*****";
    this.intNum = 1;
    this.dblPrice = 0;
    this.buyNow = false;
    this.isInCart = false;
  }
  
  // A constructor with all the variables used
  public Item(String Name, String Type, int intNumberOfItem, double Price, boolean buyOption, boolean addToCart) {
    this.strName = Name;
    this.strType = Type;
    this.intNum = intNumberOfItem;
    this.dblPrice = Price;
    this.buyNow = buyOption;
    this.isInCart = addToCart;
  }

  //A constructor for Products to call upon
  public Item(String name, String type, int NumberOfItem, double price) {
    this.strName = name;
    this.strType = type;
    this.dblPrice = price;
    this.intNum = NumberOfItem;
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

  public double getPrice() {
    return dblPrice;
  }

  public boolean isInCart() {
    return isInCart;
  }

  public String getItem() { //Basic information of an item
    return "Item name: " + strName + " | Item Type: " + strType + " | Item price: $" + dblPrice + " | Item Quantity: " + intNum;
  }

  //Setter methods
  public void setName(String Name) { //setName
    this.strName = Name;
    System.out.print("Name set to: " + strName);
  }

  public void setPrice(int Price) { //setPrice
    this.dblPrice = Price;
    System.out.print("Price set to: " + dblPrice);
  }

  public void setQuantity(int Quantity) { //setQuantity
    this.intNum = Quantity;
    System.out.print("Quantity set to: " + intNum);
  }

  //Additional setter methods to work with ShoppingCart/main
  public void setCost() {
    super.dblCost = super.dblCost + (dblPrice * intNum); // add to Cost
  }

  public void setTotalItem() { // setTotalQuantity in ShoppingCart
    this.intTotalItems = this.intTotalItems + intNum;
  }

  public void addToCart() {
    if (isInCart = true) {

    } // set isInCart
  }
}