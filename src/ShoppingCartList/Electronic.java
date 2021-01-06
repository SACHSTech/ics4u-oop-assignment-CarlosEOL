package ShoppingCartList;

import ShoppingCartList.Item.*;

public class Electronic extends Item {

  // blank Electronic constructor
  public Electronic(String Name, int NumberOfItem, int Price, boolean buyNow) {
    super(Name, "Electronic", NumberOfItem, Price, buyNow);
  }

  public String WhatIsThis() {
    return "This is a electronic.";
  }
}