/*
Examen 2ª cuatrimestre
Lavadora.java
Laura Josselin Hernandez Garcia
Ivan Gomez Luis
*/
import javax.swing.*;
public class Lavadora extends Electrodomestico
{
  private int carga=5;
  //constructorpor defecto
  public Lavadora()
  {
  }
  //constructor con el precio y peso y los demas por defecto
  public Lavadora(int precioBase, int peso)
  {
    super (precioBase, peso);
  }
  //constructor con la carga y los atributos heredados
  public Lavadora(int carga, int precioBase, int peso, String color, char consumoEnergetico)
  {
    super(precioBase,peso,color,consumoEnergetico);
    this.carga=carga;
  }
  //Método get de carga.
  public int getCarga()
  {
    return this.carga;
  }

  public double precioFinal()
  {
    double precioLava=super.precioFinal();
    if (carga>30)
    {
      precioLava=precioLava+50;
    }
    return precioLava;
  }
}
