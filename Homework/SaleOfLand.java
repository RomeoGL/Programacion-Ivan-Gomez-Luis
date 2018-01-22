/*****
*Author: Ivan gomez Luis
*Name: SaleOfLand.java
*This program calculates the area of some lands.
*****/
import java.util.Scanner;
public class SaleOfLand
{
  public static void main (String[]args)
  {
    Double B; //Base del triangulo y del rectangulo
    Double A; //Añtura del triangulo y rectangulo unidos
    Double C; //altura del rectangulo
    Double AT; //Area del triangulo
    Double AR; //Area del Rectangulo
    Double Area; //Area de la figura
    Scanner in= new Scanner(System.in);
    System.out.println ("Para calcular el precio del terreno, ingresaras las medidas en metros");
    System.out.println ("Ingrese la base de ambas figuras");
    B = in.nextDouble();
    System.out.println ("Ahora ingresa la altura de la figura completa");
    A = in.nextDouble();
    System.out.println ("Ahora ingresa unicamente la altura del rectangulo");
    C = in.nextDouble();
    AT = (B*(A-C))/2;
    AR = (B*C);
    Area = AT+AR;
    System.out.print ("El area total de la figura es de " + Area + " metros");
  }
}
