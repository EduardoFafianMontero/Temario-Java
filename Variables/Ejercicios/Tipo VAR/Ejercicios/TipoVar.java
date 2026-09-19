public class TipoVar{
  public static void main(String[] args){
    System.out.println("*** Uso de VAR en Java ***");

    // Sin usar Var//
    String nombre1="Juan";
    System.out.println("Nombe1="+nombre1);

    // Usando Var//
    var nombre2="Carlos";
    System.out.println("nombre2="+nombre2);

    //Definir otras variable//
    var edad=22; //Se define con el tipo int//
    System.out.println("edad="+edad);

    var sueldo=5000.99; //Se refiere al tipo float//
    var esCasado=false; //Se refiere al tipo boolean//
    var genero='M'; //Se refiere al tipo char//
  }
}