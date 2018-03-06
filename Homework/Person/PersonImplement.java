/*
Ivan Gomez Luis
PersonImplement
*/
import javax.swing.*;
public class PersonImplement
{
  public static void main(String[] args)
  {
    //Objeto 1
    String name=(JOptionPane.showInputDialog("Enter you name"));
    int age=(Integer.parseInt(JOptionPane.showInputDialog("Enter you age")));
    char gender=(JOptionPane.showInputDialog("Enter your gender (H or M)")).charAt(0);
    double weigth=(Double.parseDouble(JOptionPane.showInputDialog("Enter you weigth")));
    double height=(Double.parseDouble(JOptionPane.showInputDialog("Enter your height")));
    Person person1;

    person1=new Person(name, age, gender, weigth, height);
    if (gender=='H')
    {
      JOptionPane.showMessageDialog(null, name + " Tienes "+ age + " años y eres hombre");
    }
    else if (gender=='M')
    {
      JOptionPane.showMessageDialog(null, name + " Tienes "+ age + " años y eres Mujer");
    }

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
    JOptionPane.showMessageDialog(null, "Tu DNI es " + person1.generateDNI());
    //Objeto 2
    //Al objeto 2 no se le puede implementar el BMI ya que faltariar datos.
    name=(JOptionPane.showInputDialog("Enter you name"));
    age=(Integer.parseInt(JOptionPane.showInputDialog("Enter you age")));
    gender=(JOptionPane.showInputDialog("Enter your gender (H or M)")).charAt(0);
    Person person2;
    person2=new Person(name, age, gender);
    if (gender=='H')
    {
      JOptionPane.showMessageDialog(null, name + " Tienes "+ age + " años y eres hombre");
    }
    else if (gender=='M')
    {
      JOptionPane.showMessageDialog(null, name + " Tienes "+ age + " años y eres Mujer");
    }
    if (person2.IsMayorDeEdad()==true)
    {
      JOptionPane.showMessageDialog(null, "Tu eres mayor de edad");
    }
    else
    JOptionPane.showMessageDialog(null, "NO eres mayor de edad");
    JOptionPane.showMessageDialog(null, "Tu DNI es " + person2.generateDNI());
    //Objeto 3
    Person person3;
    person3=new Person();
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
    JOptionPane.showMessageDialog(null, "Tu DNI es " + person3.generateDNI());
  }
}
