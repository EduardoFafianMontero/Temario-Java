import java.util.Scanner;

public class ManejoConsola{
  public static void main(String[] args){
    // Introducir valores por consola //
    var consola= new Scanner (System.in); // in - input -entrada de datos //
    System.out.println("Escribe tu nombe: ");
    var nombre =consola.nextLine();
    System.out.println("nombre= " + nombre);
  }
}