import javax.swing.*;
public class ImplementsPerson
{
  public static void main(String[]args)
  {
    int opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Elije una opcion. \n1: Staff \n2: Student"));
    if (opc==2)
    {
      StudentPE studencito=new StudentPE("Ivan", "Tehuacan", "TIC", 1, 0.0);
      JOptionPane.showMessageDialog(null, studencito.toString(), "Studencito", JOptionPane.OK_OPTION);
    }
    else if (opc==1)
    {
      StaffPE staffcito=new StaffPE("Cordoba", "Tehuacan", "UTT", 15000);
      JOptionPane.showMessageDialog(null, staffcito.toString(), "staffcito", JOptionPane.OK_OPTION);
    }
    else
    JOptionPane.showMessageDialog(null, "Error");
  }
  
}
