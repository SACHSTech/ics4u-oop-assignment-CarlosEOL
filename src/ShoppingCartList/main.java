package ShoppingCartList;

import ShoppingCartList.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

/**
  * The main program to run to test out if all methods works with each other.
  * This he main program that perform the task like printing out in-cart items and checkout.
  * also, I know I can just use array objects to create Products, but I want it to be txt because I can edit it, test it after something changes. Also it will grant me a bigger feeling of accomplishment.
 **/

public class main {
  public static void main (String[] args) throws IOException {

    // Variables that are used to create Items, all temp files
    String strType;
    String strName;
    int intNum;
    double dblPrice;
    int intProducts = 0;
    int intSelectedItem = 0;


    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    //*reading the product.txt to find available products and print them
    FileReader products = new FileReader("src/ShoppingCartList/Products.txt");
    Scanner reader = new Scanner(products);
    
    //Starting Scanner
    while (reader.hasNext() == true) {
      strName = reader.nextLine(); //name
      strType = reader.nextLine(); //type
      dblPrice = Double.parseDouble(reader.nextLine()); //price
      intNum = Integer.parseInt(reader.nextLine()); // quantity

      intProducts = intProducts + 1;
      System.out.print(intProducts + ". ");

      Products product = new Products(strName, strType, intNum, dblPrice); // used to list and find availability

      //check availability
      if (product.availability() == false) {
        System.out.println(product.getItem() + " -- Item not available");
        System.out.println();
      }else{
        System.out.println(product.getItem() + " -- In stock");
        System.out.println();
      }
    }

    //closing scanner
    reader.close();
    products.close();

    //Creating object arrays
    products = new FileReader("src/ShoppingCartList/Products.txt");
    reader = new Scanner(products);

    // creating a object arrays of products
    Products[] product = new Products[intProducts];

    for (int intCount = 0; intCount < intProducts; intCount++) {
      //reading Products.txt
      strName = reader.nextLine(); //name
      strType = reader.nextLine(); //type
      dblPrice = Double.parseDouble(reader.nextLine()); //price
      intNum = Integer.parseInt(reader.nextLine()); // quantity

      //putting them in a object array
      product[intCount] = new Products(strName, strType, intNum, dblPrice);
    }

    //closing scanner
    reader.close();
    products.close();

    boolean isShopping = true;
    // Start of the user input
    while (isShopping == true) {
      
      File ShoppingCartList = new File("ShoppingCartList/ShoppingCartList.txt"); // ShoppingCartListCreator

      boolean addingItems = true; //toggle addingItems
      //Add Items
      while (addingItems == true) {
        //Asking user for the name of the product
        System.out.println("What's the name of the item you want to buy?");
        strName = keyboard.readLine();

        //Finding the same product name in order to continue
        for (int intCount = 0; intCount < intProducts; intCount++) {

          if (strName.equalsIgnoreCase(product[intCount].getName())) {
            addingItems = true; //found the same product name!

            if (product[intCount].availability() == false) {
              System.out.println("The product is not available! Try again!");
              addingItems = false; //the product is not available
            }else{
              intSelectedItem = intCount; // Select the Item
            }
          }else if (strName != (product[intProducts - 1].getName())){
            addingItems = false; // did not find the product...
          }
        }
      }

      // Item Found, now the quantity of the item
      boolean isQuantity = true; 
      //toggle selecting quantity
      while (isQuantity == true) {
        System.out.println("How many do you want to buy?");
        intNum = Integer.parseInt(keyboard.readLine());
        
        if (intNum > product[intSelectedItem].getQuantity()) {
          System.out.println("Over the quantity limit!");
        }else if (intNum == 0) {
          System.out.println("Nope! You gotta buy at least 1");
        }else{
          isQuantity = false;
        }
      }

      //Write into File
      FileWriter listWriter = new FileWriter("ShoppingCartList.txt");
      listWriter.write("asd");
      

      listWriter.close();
    }
    
    //Creating a new object for new Shopping cart list

  }
}