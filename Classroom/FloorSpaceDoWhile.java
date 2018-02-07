/*
FloorSpaceDoWhile.java
Ivan Gomez Luis
This program calculates total floor space in a house.
*/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile
{
  public static void main(String[] args)
  {
    double length, width; //room dimension
    double floorSpace=0; //house's total floor space
    char response; //user's response
    do
    {
      length=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the room's length","My input",JOptionPane.WARNING_MESSAGE));
      width=Double.parseDouble(JOptionPane.showInputDialog("Enter the room's width"));
      floorSpace +=length*width;
      response=JOptionPane.showInputDialog("Any more room? Y/N").charAt(0);
    }while(response=='Y' || response=='y');
    JOptionPane.showMessageDialog(null, "The total floor space is " + floorSpace, "HELLO",JOptionPane.WARNING_MESSAGE);
  }
}
