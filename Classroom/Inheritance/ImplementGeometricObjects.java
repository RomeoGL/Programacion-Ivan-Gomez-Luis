import javax.swing.*;
public class ImplementGeometricObjects
{
  public static void main(String[] args)
  {
    GeometricObject circlelito=new CircleGO(3.5, "Blue", true);
    JOptionPane.showMessageDialog(null, "The area is " + circlelito.getArea());
    JOptionPane.showMessageDialog(null, "The circle was created on " + circlelito.getdateCreated());
    JOptionPane.showMessageDialog(null, circlelito.toString(), "HI", JOptionPane.OK_OPTION);

    GeometricObject rectanglelito=new RectangleGO(10,20, "Red", true);
    JOptionPane.showMessageDialog(null, "The area is " + rectanglelito.getArea());
    JOptionPane.showMessageDialog(null, "The perimeter is " + rectanglelito.getPerimeter());
    JOptionPane.showMessageDialog(null, "The rectangle was crated on " + rectanglelito.getdateCreated());
    //Polimorfismo
  }
}
