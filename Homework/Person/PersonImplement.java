/*
Ivan Gomez Luis
PersonImplement
*/
import javax.swing.*;
public class PersonImplement
{
  public static void main(String[] args)
  {
    int opc;
    do
    {
      opc=Integer.parseInt(JOptionPane.showInputDialog("Elije un objeto: 1, 2 o 3. \n4 para salir."));
      switch(opc)
      {
        case 1:
        Person person1;
        person1=new Person();
        person1.SetName(JOptionPane.showInputDialog("Enter you name"));
        person1.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter you age")));
        person1.setGender(JOptionPane.showInputDialog("Enter your gender (H or M)"));
        person1.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter you weigth")));
        person1.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter your height")));
        if (person1.calculateBMI()==-1)
        {
          JOptionPane.showMessageDialog(null, "Tu estas bajo de peso");
        }
        else if (person1.calculateBMI()==0)
        {
          JOptionPane.showMessageDialog(null, "Tu estas en tu peso correcto");
        }
        else
        JOptionPane.showMessageDialog(null, "Tu estas gordo");
        if (person1.IsMayorDeEdad()==true)
        {
          JOptionPane.showMessageDialog(null, "Tu eres mayor de edad");
        }
        else
        JOptionPane.showMessageDialog(null, "NO eres mayor de edad");
        break;
        case 2:
        Person person2;
        person2=new Person();
        person2.SetName(JOptionPane.showInputDialog("Enter you name"));
        person2.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter you age")));
        person2.setGender(JOptionPane.showInputDialog("Enter your gender (H or M)"));
        if (person2.calculateBMI()==-1)
        {
          JOptionPane.showMessageDialog(null, "Tu estas bajo de peso");
        }
        else if (person2.calculateBMI()==0)
        {
          JOptionPane.showMessageDialog(null, "Tu estas en tu peso correcto");
        }
        else
        JOptionPane.showMessageDialog(null, "Tu estas gordo");
        if (person2.IsMayorDeEdad()==true)
        {
          JOptionPane.showMessageDialog(null, "Tu eres mayor de edad");
        }
        else
        JOptionPane.showMessageDialog(null, "NO eres mayor de edad");
        break;
        case 3:
        Person person3;
        person3=new Person("Nuri", 63, "M", 70, 159);
        if (person3.calculateBMI()==-1)
        {
          JOptionPane.showMessageDialog(null, "Tu estas bajo de peso");
        }
        else if (person3.calculateBMI()==0)
        {
          JOptionPane.showMessageDialog(null, "Tu estas en tu peso correcto");
        }
        else
        JOptionPane.showMessageDialog(null, "Tu estas gordo");
        if (person3.IsMayorDeEdad()==true)
        {
          JOptionPane.showMessageDialog(null, "Tu eres mayor de edad");
        }
        else
        JOptionPane.showMessageDialog(null, "NO eres mayor de edad");
        break;
        case 4:
        JOptionPane.showMessageDialog(null, "bye");
        break;
        default:
        JOptionPane.showMessageDialog(null, "error");
        break;
      }
    }
    while(opc!=4);
  }
}
