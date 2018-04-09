/*
Examen 2ª cuatrimestre
Main.java
Laura Josselin Hernandez Garcia
Ivan Gomez Luis
*/
import javax.swing.*;
public class Main
{
  public static void main(String[] args)
  {
    int i=0;
    int cantiLava=0, cantiTele=0;
    double precioLava=0.0, precioTele=0.0;
    Electrodomestico arrayElectrodomesticos[]=new Electrodomestico [10];
    arrayElectrodomesticos[0]=new Television (30, false, 2500, 10, "rojo",'C');
    arrayElectrodomesticos[1]=new Lavadora (10, 3500, 15, "Blanco", 'D');
    arrayElectrodomesticos[2]=new Television (4856, 5);
    arrayElectrodomesticos[3]=new Television (50, true, 15000, 20, "rojo", 'F');
    arrayElectrodomesticos[4]=new Lavadora (8500, 25);
    arrayElectrodomesticos[5]=new Lavadora (50, 20000, 58, "negro",'F');
    arrayElectrodomesticos[6]=new Television (32, true, 7850, 10, "amarillo", 'E');
    arrayElectrodomesticos[7]=new Lavadora ();
    arrayElectrodomesticos[8]=new Television ();
    arrayElectrodomesticos[9]=new Television (43, false, 17000, 15, "azul",'A');
    do
    {
      if (arrayElectrodomesticos[i] instanceof Television)
      {
        precioTele=precioTele+arrayElectrodomesticos[i].precioFinal();
        cantiTele=cantiTele+1;
      }
      else if (arrayElectrodomesticos[i] instanceof Lavadora)
      {
        precioLava=precioLava+arrayElectrodomesticos[i].precioFinal();
        cantiLava=cantiLava+1;
      }
      i=i+1;
    }
    while(i!=arrayElectrodomesticos.length);
      JOptionPane.showMessageDialog(null, "El precio total por las " + cantiLava + " lavadoras es de $" + precioLava + "\nEl precio total por las " + cantiTele  + " televisiones es de $" + precioTele, "Cantidad", JOptionPane.OK_OPTION);
      JOptionPane.showMessageDialog(null, "El precio total por todos los Electrodomesticos es de " + (precioLava+precioTele), "Total", JOptionPane.OK_OPTION);
  }//end main
}//end class
