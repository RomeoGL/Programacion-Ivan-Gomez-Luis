import javax.swing.*;
public class PasswordTest
{
  public static void main(String[] args)
  {
    int a;
    char opc;
    Password test;
    int i=0;
    int may=0;
    int num=0;
    int min=0;
    test=new Password();
    test.setPassword(JOptionPane.showInputDialog("Ingresa la contraseña"));
    a=test.getPassword().length();
    //Tamaño del password
    if (a==8)
    {
      do
      //Caracteres de el password
      {
        opc=test.getPassword().charAt(i);
        if (opc==1 || opc==2 || opc==3 || opc==4 || opc==5 || opc==6 || opc==7 || opc==8 || opc==9)
        {
          num=num+1;
        }
        else if (opc=="a")
        {
          min=min+1;
        }
        else if (opc=="A")
        {
          may=may+1;
        }
        i=i+1;
      }
      while(i!=8);
      if (num==5 && min==1 && may==2)
      //Seguridad de password Alta
      {
        JOptionPane.showMessageDialog(null, "Tu contraseña es segura");
      }
      //Seguridad de password baja
      else
      {
        JOptionPane.showMessageDialog(null, "Tu contraseña no es segura");
      }
    }
    else
    {
      JOptionPane.showMessageDialog(null, "The size of your password is not correct");
    }
  }
}
