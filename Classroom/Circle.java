/*
Circle.java
Ivan GOmez Luis
This class calculates the area of a circle
*/
import javax.swing.*;

public class circle
{
  //prupies
  private double radius; //Se teriere que pertenece a
  //methods
  public void setRadius(double radius)
  {
    this.radius=radius;
  }
  public double getRadius()
  {
    return this.radius;

  }
  public double getArea()
  {
    return Math.pow(this.radius, 2)*Math.PI;
  }
  public static void main(String[] args) {
    circle =new circle();
    circle.setRadius(3.14);
    JOptionPane.showMessageDialog(null, circle.getArea());
  }
}
