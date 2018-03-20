/*
Ivan Gomez Luis
Entregable.java
Interfaz
*/
interface Entregable
{
  void entregar(Boolean entregado);//Cambia el atributo prestado a true
  void devolver(Boolean entregado);//Cambia el atributo prestado a false
  void isEntregado(Boolean entregado);//Devuelve el estado del atributo prestado
}
