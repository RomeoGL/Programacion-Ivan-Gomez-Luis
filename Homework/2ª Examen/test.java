import javax.swing.*;
public class test
{
  public static void main(String[] args)
  {
    /**************** Esto era pa probrar lode consumo electrodomésticos
    char consumoEnergetico='F';
  //  char letra=Character.getNumericValue(consumoEnergetico);
    JOptionPane.showMessageDialog(null, consumoEnergetico);
  /*  if (consumoEnergetico==70)
    {
      JOptionPane.showMessageDialog(null, "La letra es correcta");
    }
    else if (consumoEnergetico!='A')
    {
      consumoEnergetico='F';
      JOptionPane.showMessageDialog(null, "Letra incorrecta, usando letra por defecto");
      if (consumoEnergetico>=65 && consumoEnergetico<=70)
      {
         JOptionPane.showMessageDialog(null, "La letra es correcta");
      }
      else
      {
      consumoEnergetico='F';
       JOptionPane.showMessageDialog(null, "Letra incorrecta, usando letra por defecto");
       */
   String palabra="amarrillo";
   String color=palabra.toUpperCase();
   System.out.println(color);
   switch(color)
  {
    case "NEGRO":
    System.out.println("correcto");
    break;
    case "ROJO":
    System.out.println("correcto");
    break;
    case "AZUL":
    System.out.println("correcto");
    break;
    case "BLANCO":
    System.out.println("correcto");
    break;
    case "GRIS":
    System.out.println("correcto");
    break;
    default:
    System.out.println("error");
    System.out.println(color="blanco");
    break;
  }
/*   if (color!="NEGRO" || color!="ROJO" || color!="AZUL" || color!="BLANCO" || color!="GRIS")
   {
   JOptionPane.showMessageDialog(null, "El color es incorrecto");
   color="Blanco";
   }
   else if (color=="NEGRO" || color=="ROJO" || color=="AZUL" || color=="BLANCO" || color=="GRIS")
   {
     JOptionPane.showMessageDialog(null, "El color es correcto");
   }*/

  }
}
