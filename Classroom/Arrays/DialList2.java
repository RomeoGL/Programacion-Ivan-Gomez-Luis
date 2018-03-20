/********
DialList2.java
Ivan Gomez Luis
This program creates a dial phone numbers list and prints the created list. Int uses a partially
filled array
*********/
import javax.swing.*;
public class DialList2
{
  public static void main (String[] args)
  {
    String phoneList[]=new String[100];// declaracion e inicializacion
    int filledNumbers=0;//number of phones
    String phoneNum;//an enteder phone number
    phoneNum=JOptionPane.showInputDialog(null, "Enter a phone number(or q to QUIT)");
    while (!phoneNum.equalsIgnoreCase("q") && filledNumbers<phoneList.length)
    {
      if (phoneNum.length()<10)
      {
        JOptionPane.showMessageDialog(null, "Must enter a valid number(10 characteres)");
      }
      else
      {
        phoneList[filledNumbers]=phoneNum;
        filledNumbers++;
      }
      phoneNum=JOptionPane.showInputDialog(null, "Enter a phone number(or q to QUIT)");  
    }
    //End while
    JOptionPane.showMessageDialog(null, "Dial List");
    for (int i =0 ;i<filledNumbers ;i++ )
    {
      JOptionPane.showMessageDialog(null, (i+1) + " phone " + phoneList[i]);
    }
  }
}
