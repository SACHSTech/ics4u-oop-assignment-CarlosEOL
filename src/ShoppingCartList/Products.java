package ShoppingCartList;

import ShoppingCartList.*;
import ShoppingCartList.Item.*;
import java.io.*;

public class Products extends Item {

  private int intNum;

  // blank Electronic constructor
  public Products(String name, String type, int NumOfProduct, double price) {
    super(name, type, NumOfProduct, price);
    this.intNum = NumOfProduct;
  }
  
  public boolean availability() {
    if (intNum == 0) {
      return false;
    }
    return true;
  }

}