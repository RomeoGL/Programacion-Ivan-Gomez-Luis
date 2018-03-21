import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Bear

{
  private final String MAKER; //Bear's manufacturer
  private final String TYPE; //type of Bear
  public Bear(String maker, String type)
  {
    this.MAKER = maker;
    this.TYPE = type;
  }
  public void display(){
    JOptionPane.showMessageDialog(null, MAKER + " " + TYPE);
  }
  public static void main(String[] args)
  {
    ArrayList<Bear> teddyBearStore=new ArrayList<Bear>();
    int opc=Integer.parseInt(JOptionPane.showInputDialog(null, ".......MENU...... \n 1.- Add Bear \n 2.-Search \n 3.- Remove \n 4.- Show all \n 5.-Exit"));
    do
    {
      switch(opc)
      {
        case 1: String maker=JOptionPane.showInputDialog("Maker?");
        String type=JOptionPane.showInputDialog("Type?");
        Bear winniePooh = new Bear(maker, type);
        teddyBearStore.add(winniePooh);
        break;
        case 2:
        int index=Integer.parseInt(JOptionPane.showInputDialog("Index?"));
        JOptionPane.showMessageDialog(null, teddyBearStore.get(index));
        break;
        case 3:
        index=Integer.parseInt(JOptionPane.showInputDialog("Index to remove?"));
        if (teddyBearStore.remove(index) !=null)
        {
          JOptionPane.showMessageDialog(null, "Element remove");
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Element WASN'T removed");
        }
        break;
        case 4:
        for(Bear bear: teddyBearStore)
        {
          bear.display();
        }
        break;
        case 5:
        JOptionPane.showMessageDialog(null, "Bye");
        break;
        default:
        JOptionPane.showMessageDialog(null, "Error, aprende a leer");
        break;
      }
      opc=Integer.parseInt(JOptionPane.showInputDialog(null, ".......MENU...... \n 1.- Add Bear \n 2.-Search \n 3.- Remove \n 4.- Show all \n 5.-Exit"));
    }
    while(opc!=5);
  }
}
