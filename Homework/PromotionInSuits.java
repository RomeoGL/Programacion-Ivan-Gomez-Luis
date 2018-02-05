/*
Ivan Gomez Luis
PromotionInSuits.java
This program calculates how much a customer will pay for a suit to which a discount has been applied
exercise 2.4
*/
import javax.swing.JOptionPane;
public class PromotionInSuits
{
  public static void main(String[] args)
  {
    double ct; //costo del traje
    double de; //descuento que se obtendra
    double pf; //Precio final del traje
    ct=Double.parseDouble(JOptionPane.showInputDialog("Enter the price of suit"));
    if (ct>=2500)
    {
      de=(ct*0.15);
      pf=(ct-de);
      JOptionPane.showMessageDialog(null, "Suit \n\n" + "Price of suit: $" + ct + "\nDiscount: $" + de + "\nFinal price: $" + pf );
    }
    else if (ct<2500)
    {
      de=(ct*0.8);
      pf=(ct-de);
      JOptionPane.showMessageDialog(null, "Suit \n\n" + "Price of suit: $" + ct + "\nDiscount: $" + de + "\nFinal price: $" + pf );
    }

  }
}
