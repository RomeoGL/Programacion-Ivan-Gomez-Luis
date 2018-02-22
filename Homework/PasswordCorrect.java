/*
Ivan Gomez Luis
PasswordCorrect.java
*/
import javax.swing.*;
public class PasswordCorrect
{
  public static void main(String[] args)
  {
    Password person;
    person=new Password();
    boolean b=false,a=false;
    int opc;
    int opc1=0;
    do
    {
      opc=Integer.parseInt(JOptionPane.showInputDialog(null, "****Menu**** \nSelect a option \n1: Enter your password \n2: Check your size \n3: Check the security \n4:Exit"));
      switch (opc)
      {
        case 1:
        person.setPassword(JOptionPane.showInputDialog(null, "Enter your password"));
        break;
        case 2:
        b=person.setSize();
        break;
        case 3:
        a=person.getIsStrong();
        if (b!=false)
        {
          if (a==true)
          {
            JOptionPane.showMessageDialog(null, "Your password is secure");
          }
          else if (a==false)
          {
            JOptionPane.showMessageDialog(null, "Your password is not secure \nPlease try again.");
          }
        }
        break;
        case 4:
        JOptionPane.showMessageDialog(null, "See you later, shutting down");
        opc=9;
        break;
        default:
        opc1=JOptionPane.showConfirmDialog(null, "Error, wrong option, retry?");

        break;
      }
    }
    while (opc!=9 || opc1!=JOptionPane.YES_OPTION);
    }
}
