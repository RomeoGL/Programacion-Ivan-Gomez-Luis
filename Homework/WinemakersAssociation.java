/*
Ivan Gomez Luis
WinemakersAssociation.java

Exercise  2.7
*/
import javax.swing.JOptionPane;
public class WinemakersAssociation
{
  public static void main(String[] args)
  {
    String ti; //Tipo de la uva
    int ta; //Tamaño de la uva
    double p; //Precio de la uva
    int k; //Kilos de produccion
    double ga; //Ganancia obtenida
    p=Double.parseDouble(JOptionPane.showInputDialog("Enter the Price of the Kg of grapes"));
    k=Integer.parseInt(JOptionPane.showInputDialog("How many kilograms of grapes were produced"));
    ti=JOptionPane.showInputDialog("Enter the type of grape");
    switch(ti)
    {
      case "A":
      ta=Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the grape"));
      if (ta==1)
      {
        ga=(p*0.20)*k;
        JOptionPane.showMessageDialog(null, "The profit is $" + ga);
      }
      else if (ta==2)
      {
        ga=(p*0.30)*k;
        JOptionPane.showMessageDialog(null, "The profit is $" + ga);
      }
      break;
      case "B":
      ta=Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the grape"));
      if (ta==1)
      {
        ga=(p*0.30)*k;
        JOptionPane.showMessageDialog(null, "The profit is $-" + ga);
      }
      else if (ta==2)
      {
        ga=(p*0.50)*k;
        JOptionPane.showMessageDialog(null, "The profit is $-" + ga);
      }
    }
  }
}
