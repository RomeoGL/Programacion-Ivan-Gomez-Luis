/*
Ivan Gomez Luis
Person.java

*/
import javax.swing.*;
public class Person
{
  final String h="Hombre";
  private String name=" ";
  private int age=0;
  private int DNI;
  private char gender=h.charAt(0);
  private double weigth=0;
  private double height=0;

  //Metodos Set
  public void SetName(String name)
  {
    this.name=name;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
  public void setGender(char gender)
  {
    this.gender=gender;
  }
  public void setWeigth(double weigth)
  {
    this.weigth=weigth;
  }
  public void setHeight(double height)
  {
    this.height=height;
  }
  public Person()//Un constructor por defecto.
  {
    JOptionPane.showMessageDialog(null, this.name=" ", "name" , JOptionPane.OK_OPTION);
    JOptionPane.showMessageDialog(null, this.age=0, "age", JOptionPane.OK_OPTION);
    JOptionPane.showMessageDialog(null, this.gender=h.charAt(0), "Gender", JOptionPane.OK_OPTION);
    JOptionPane.showMessageDialog(null, this.weigth=0, "weigth", JOptionPane.OK_OPTION);
    JOptionPane.showMessageDialog(null, this.height=0, "height", JOptionPane.OK_OPTION);
    JOptionPane.showMessageDialog(null, this.DNI=DNI, "DNI", JOptionPane.OK_OPTION);
  }
  public Person(String name, int age, char gender)//Un constructor con el nombre, edad y sexo, el resto por defecto.
  {
    this.name=name;
    this.age=age;
    this.gender=gender;
  }
  public Person(String name, int age, char gender, double weigth, double height)//Un constructor con todos los atributos como parámetro
  {
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.weigth=weigth;
    this.height=height;
    this.DNI=DNI;
  }
  //Metodos
  public int calculateBMI()//Calcula el BMI de la persona en cuestion
  {
    double bmi=this.weigth/Math.pow(this.height,2);
    if (bmi<20)
    {
      return -1;
    }
    else if (bmi>=20 && bmi<25)
    {
      return 0;
    }
    else
    return 1;
  }
  public Boolean IsMayorDeEdad()//Calcula si es mayor de edad
  {
    if (this.age>=18)
    {
      return true;
    }
    else
    return false;
  }
  public int generateDNI()
  {
    return this.DNI=(int)(Math.random()*(9999999-1+1)+9999999);
  }
}
