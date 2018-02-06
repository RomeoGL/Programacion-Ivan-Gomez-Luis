/*Ivan Gomez Luis
WhileLoop.java
This program makes entries in a bridal registry
*/
import javax.swing.JOptionPane;
public class WhileLoop
{
  public static void main(String[] args)
  {
    String registry="";
    char more;
    more=JOptionPane.showInputDialog("Do you want to create a bridal registry? (Y/N)").charAt(0);
    while(more=='Y' || more 'y')
    {
      registry += JOptionPane.showInputDialog("Enter item: ");
      registry += JOptionPane.showInputDialog("Enter store: \n");
      registry +="\n";
      more=JOptionPane.showInputDialog("Any more items? (Y/N)").charAt(0);
    }//end while
    if (!registry.equals(""))
  {
    JOptionPane.showMessageDialog(null, "\nBridal registry\n" + registry);
  }
  }//
}//end program
