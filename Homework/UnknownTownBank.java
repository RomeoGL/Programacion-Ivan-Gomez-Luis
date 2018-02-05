/*
Ivan Gomez Luis
UnknownTownBank
This program calculates the credit limit increase in "Unknown Town" bank cards and prints the result on the screen
Exercise 2.9
*/
import javax.swing.JOptionPane;
public class UnknownTownBank
{
  public static void main(String[] args)
  {
    int tt; //Tipo de tarjeta
    double la; //Limite actual de credito
    double ac; //Aumento de credito
    double nc; //Nuevo limite de credito
    int o;
    o=Integer.parseInt(JOptionPane.showInputDialog("Do you have more than one card? 2=Yes 1=no"));
    switch(o)
    {
    case 1:
      la=Double.parseDouble(JOptionPane.showInputDialog("Enter the credit limit"));
      tt=Integer.parseInt(JOptionPane.showInputDialog("Enter the card type"));
      switch(tt)
      {
        case 1:
          ac=la*0.25;
          nc=la+ac;
          JOptionPane.showMessageDialog(null, "The new credit limit is $" + nc);
        break;
        case 2:
          ac=la*0.35;
          nc=la+ac;
          JOptionPane.showMessageDialog(null, "The new credit limit is $" + nc);
        break;
        case 3:
          ac=la*0.40;
          nc=la+ac;
          JOptionPane.showMessageDialog(null,"The new credit limit is $" + nc);
        break;
        default:
          ac=la*0.50;
          nc=la+ac;
          JOptionPane.showMessageDialog(null, "The new credit limit is $" + nc);
        break;
      }
      break;
    case 2:
      la=Double.parseDouble(JOptionPane.showInputDialog("Enter the credit limit"));
      tt=Integer.parseInt(JOptionPane.showInputDialog("Enter the type of card in which you want to increase the credit"));
      switch(tt)
      {
        case 1:
          ac=la*0.25;
          nc=la+ac;
          JOptionPane.showMessageDialog(null, "The new credit limit is $" + nc);
        break;
        case 2:
          ac=la*0.35;
          nc=la+ac;
          JOptionPane.showMessageDialog(null, "The new credit limit is $" + nc);
        break;
        case 3:
          ac=la*0.40;
          nc=la+ac;
          JOptionPane.showMessageDialog(null,"The new credit limit is $" + nc);
        break;
        default:
          ac=la*0.50;
          nc=la+ac;
          JOptionPane.showMessageDialog(null, "The new credit limit is $" + nc);
        break;
      }
      break;
    }
  }
}
