/***********************
Ivan Gomez Luis
PrintPurchaseOrder.java
This program calculates and prints a purchase order amount
***********************/
import java.util.Scanner;
public class PrintPurchaseOrder
{
  public static void main(String[] args)
  {
    Scanner userData = new Scanner (System.in);
    double price;
    int quantity;
    String product;
    System.out.println ("Enter the name of product");
    product = userData.nextLine();
    System.out.println ("Enter the price");
    price = userData.nextDouble();
    System.out.println ("Enter the quantity");
    quantity = userData.nextInt();
    System.out.println("Total purchase order the " + product + " $" + price*quantity);
  }
}
