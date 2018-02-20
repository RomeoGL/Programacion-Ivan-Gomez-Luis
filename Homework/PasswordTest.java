import javax.swing.*;
public class PasswordTest
{
  public static void main(String[] args)
  {
    Password test;
    test=new Password();
    test.setPassword(JOptionPane.showInputDialog("Ingresa la contraseña"));
    JOptionPane.showMessageDialog(null, test.getPassword());
    JOptionPane.showMessageDialog(null, test.getPassword().length());
//    setLongitud=test.getPassword().length();
    getPassword=isStrong();

    {

    }


  }
}
