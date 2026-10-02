import java.util.Scanner;
public class RecetasCocina{
  public static void main(String[] args){
    System.out.print("*** Recetas de Cocina ***");
    var consola = new Scanner (System.in);
    // Nombre de la receta //
    System.out.print("Ingrese el nombe: ");
    var NombreReceta = consola.nextLine();
    // Cantidad de ingedientes //
    System.out.print("Ingrese los ingredientes: ");
    var IngredietesReceta = consola.nextLine();
    // Tiempo de peparación
    System.out.print("Ingresa el tiempo de prepaacion (mi): ");
    var TiempoPeparacion = Integer.parseInt(consola.nextLine());
    // Dificultad de la preparacionn
    System.out.print("Ingrese la dificultad: ");
    var DificultadPreparacion = consola.nextLine();

   // Impimi valoes de la eceta //
    System.out.println("\n Receta Cocina: ");
    System.out.println("\tnombe de la receta:" + NombreReceta);
    System.out.println("\tIngredientes:" + IngredietesReceta);
    System.out.println("\tTiempo de la prepración:" + TiempoPeparacion + "minutos");
    System.out.println("\tDificultad de Preparacion:" + DificultadPreparacion);
    consola.close();
  }
}