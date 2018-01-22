/*****
*Author: Ivan gomez Luis
*Name: AreaOfATrainfule.java
*This program prints in display the area of a triangule.
*****/
import java.util.Scanner;
public class AreaOfARectangule
{
  public static void main (String[]args)
  {
    int A;     //Altura del Rectangulo
    int B;     //Base del Rectangulo
    int Area;  //Area del Rectangulo
    Scanner in = new Scanner(System.in);
    System.out.println ("Ingresa la altura del Rectangulo");
    A = in.nextInt();
    System.out.println ("Ingresa la base del Rectangulo");
    B = in.nextInt();
    Area=(B*A);
    System.out.println ("El area del Rectangulo es " + Area);
  } //End main
}  //End AreaOfARectangules
