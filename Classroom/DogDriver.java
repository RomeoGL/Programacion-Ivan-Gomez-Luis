/***********
DogDriver.java
Ivan Gomez Luis
Tihs program creates dog objects and uses Dog class
***********/
import javax.swing.*;
public class DogDriver
{
  public static void main(String[] args)
  {
    Dog fido;
    fido = new Dog();
    fido.setColor("black");
    fido.setEyeColor("Blue");
    JOptionPane.showMessageDialog(null, fido.getColor());
    JOptionPane.showMessageDialog(null, fido.getEyeColor());
    fido.eat();
    fido.bark();
    fido.sleep();

    //------------
    Dog fufi=new Dog();
    fufi.setColor("Black and blue");
    fufi.setEyeColor("purple");
    JOptionPane.showMessageDialog(null, "fufi's eyes color is " + fufi.getEyeColor());
    fufi.sleep();
  }
}
