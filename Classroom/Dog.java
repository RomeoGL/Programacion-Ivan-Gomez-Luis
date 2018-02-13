/*******
Dog.java
Ivan Gomez Luis
This class sets the dog's propierties and methods
Medoto tipo de dato GET=obtener
metodo void SET=establecer
********/
import javax.swing.*;
public class Dog{
  //Dog's propierties - Variables
  private String color;
  private String eyeColor;
  private double height;
  private double lenght;
  private double weight;

  //Sets the dog's color
  public void setColor(String dogColor)
  {
    color=dogColor;
  }
  //gets the dog's color
  public String getColor()
  {
    return color;
  }
  //sets dog's eyeColor
  public void setEyeColor(String dogEyeColor)
  {
    eyeColor= dogEyeColor;
  }
  //gets dog's eyeColor
  public String getEyeColor()
  {
    return eyeColor;
  }
  //Yo
  public void setHeight(double dogHeight)
  {
    height=dogHeight;
  }
  public double getHeight()
  {
    return height;
  }
  public void setLength(double dogLength)
  {
    lenght=dogLength;
  }
  public double getLength()
  {
    return lenght;
  }
  public void setWeight(double dogWeight)
  {
    weight=dogWeight;
  }
  public double getWeight()
  {
    return weight;
  }
  //Dog's Methods - action
  public void sit(){
    JOptionPane.showMessageDialog(null,"The dog is sat");
  }
  //Bark Method
  public void bark(){
    JOptionPane.showMessageDialog(null,"The dog is barking");
  }
  //Lay down Method
  public void layDown(){
    JOptionPane.showMessageDialog(null,"The is laid down ");
  }
  //Sleep Method
  public void sleep(){
    JOptionPane.showMessageDialog(null,"The dog is sleeping");
  }
  //eat Method
  public void eat(){
    JOptionPane.showMessageDialog(null,"The dog is eating");
  }
}
