/*****
*Author: Ivan gomez Luis
*Name: SwimmingPool.java
*This program calculates what a person will pay for filling a pool.
*****/
import java.io.*;
public class SwimmingPool
{
  public static void main(String[]args) throws IOException
  {
    BufferedReader bufLeer = new BufferedReader(new InputStreamReader(System.in));
    float A; //Altura de la alberca
    float L; //Largo de la alberca
    float N; //Ancho de la alberca
    float CM; //Costo del metro cubico
    float V; //Volumen de la alberca
    float PAG; //Pago a realizar por el consumo
    System.out.println ("Hola, por favor ingrese el precio por metro cubico de agua");
    CM=Float.parseFloat(bufLeer.readLine());
    System.out.println ("Ingresa la altura de la alberca");
    A=Float.parseFloat(bufLeer.readLine());
    System.out.println ("Ingresa el largo de la alberca");
    L=Float.parseFloat(bufLeer.readLine());
    System.out.println ("Ingresa el ancho de la alberca");
    N=Float.parseFloat(bufLeer.readLine());
    V=A*L*N;
    PAG=CM*V;
    System.out.println ("EL total a pagar es de $" + PAG + " por llenar la alberca");
  }//End main
} //End SwimmingPool
