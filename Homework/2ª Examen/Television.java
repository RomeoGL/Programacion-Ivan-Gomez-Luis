/*
Examen 2ª cuatrimestre
Television.java
Laura Josselin Hernandez Garcia
Ivan Gomez Luis
*/ 
import javax.swing.*;
public class Television extends Electrodomestico
{
  private int resolucion=20;
  private Boolean sintonizadorTDT=false;
  //constructor por defecto
  public Television()
  {
  }
  //constructor con el precio y peso y el resto por defecto
  public Television(int precioBase, int peso)
  {
    super(precioBase, peso);
  }
  //constructor con todos los atributos
  public Television(int resolucion, Boolean sintonizadorTDT, int precioBase, int peso, String color, char consumoEnergetico)
  {
    super(precioBase, peso, color, consumoEnergetico);
    this.resolucion=resolucion;
    this.sintonizadorTDT=sintonizadorTDT;
  }
  //Método get de resolución y sintonizador TDT.
  public int getResolucion()
  {
    return this.resolucion;
  }
  public Boolean sintonizadorTDT()
  {
    return this.sintonizadorTDT;
  }
  public double precioFinal()
  {
    double precioTele=super.precioFinal();
    if (resolucion>=40 )
    {
    precioTele=precioTele*1.30;
    }
    if (sintonizadorTDT==true)
    {
      precioTele=precioTele+50;
    }
    return precioTele;
  }
  //end precioFinal
}//end class
