/*
Ivan Gomez Luis
PrintPurchaseOrderGui.java
This programa calculates adn prints a purchase order report
*/
import javax.swing.JOptionPane;
public class PrintPurchaseOrderGui
{
  public static void main(String[] args)
  {
    String itemName; //name of purchase item
    double price; //price of purchase item
    int quantity; //numbre of item pruchase
    itemName = JOptionPane.showInputDialog("Enter name of purchase item");
    price = Double.parseDouble (JOptionPane.showInputDialog("Enter price of one item"));
    quantity = Integer.parseInt(JOptionPane.showInputDialog ("Enter quantity"));

    JOptionPane.showMessageDialog(null, "PURCHASE ORDER: \n\n" + "Item: " + itemName + "\nPrice" + price + "\nQuantity: " + quantity + "\nTotal $" + price*quantity);
  } //end main
} //end class PrintPurchaseOrderGui
