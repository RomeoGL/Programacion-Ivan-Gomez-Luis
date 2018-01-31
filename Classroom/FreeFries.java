/****
FreeFries.java
Ivan Gomez Luis
This program reads points score by home team adn the opposing team and determinates
IF the fans win free french fries
****/
import javax.swing.JOptionPane; //para utilizar modo grafico GUI
public class FreeFries
{
  public static void main(String[]args) 
  {
    int homePoints; //points scored by home team
    int opponentPoints; //points scored by opposing team
    homePoints =
    Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints =
    Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));
    if (homePoints>opponentPoints && homePoints >= 100)
    {
      JOptionPane.showMessageDialog(null, "A free order of French Fries for White Tigers Fans");
    }
  }
}
