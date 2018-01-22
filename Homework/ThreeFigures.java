/*****
*Author: Ivan gomez Luis
*Name: ThreeFigures.java
*This program helps to calculate the area of a figure composed of several and prints the result.
*****/
import java.util.Scanner;
public class ThreeFigures
{
  public static void main (String[]args)
  {
    Double R; //Base del triangulo rectangulo y radio
    Double H; //Hipotenusa del triangulo Rectangulo
    Double C; //Cateto faltante
    Double AT; //Area triangular
    Double AC; //Area circular
    Double PI=3.1416; //Constante
    Double Area; //Area de la figura
    Scanner in = new Scanner(System.in);
    System.out.println ("Para un optimo servicio, ingrese sus medidas en metros");
    System.out.println ("Ingrese el radio de la media esfera de la parte superior de la figura");
    R= in.nextDouble();
    AC = ((PI*(R*R))/2);
    System.out.println ("Por favor ahora introduzca la medida tomada de la punta de la figura hasta el inicio del radio");
    H = in.nextDouble();
    C = (Math.sqrt((H*H)+(R*R)));
    AT=(C*R);
    Area = AC + AT;
    System.out.println ("El area de su figura es de " + Area + " metros");
  } //End ThreeFigures
} //End main
