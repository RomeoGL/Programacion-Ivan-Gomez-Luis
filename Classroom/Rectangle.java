/*
Ivan Gomez Luis
Rectangle.java
This class implements a rectangle with constructors
*/
import javax.swing.*;
public class Rectangle
{
  //Atributes o properties
  private double heigth;
  private double width;

  public Rectangle()
  {
    this.height=10;
    this.width=20;
  }
  public Rectangle(double height, double width)
  {
    this.heigth=height;
    this.width=width;
  }
  public double getArea()
  {
    return this.width*this.height;
  }

  public static void main(String[] args)
  {
    Rectangle rectangle=new Rectangle();
    JOptionPane.showMessageDialog(null, "The area is " + rectangle.getArea());
    Rectanble rectanble2=new Rectangle(5,10);
    JOptionPane.showMessageDialog(null, "The rectangle2's area is " + rectangle2.getArea());
  }
}
