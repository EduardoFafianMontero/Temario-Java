import java.util.Scanner;
public class SaludFitnes{
  public static void main(Sing[] args){
    System.out.println("*** Salud y Fitnes ***");

    // Constantes
    final var META_PASOS = 10000;
    final var CALORIAS_POR_PASO = 0.04; // Valor aproximado de calorías quemadas por paso

    // Pedimos los valoes al usuario 
    var consola = new Scanner(System.in);
    System.out.print("Ingrese tu nombre: ");
    var nombre = consola.nextLine();

    System.out.print("Ingresa el número de pasos que has dado hoy: ");
    var pasos = consola.nextInt();

    // Veificar si el usuario alcanzó la meta de pasos diarios 
    var metaAlcanzada = (pasos >= META_PASOS) ? "¡Felicidades! Has alcanzado tu meta de pasos diarios." : "No has alcanzado tu meta de pasos diarios. ¡Sigue intentándolo!";

    // Calculamos las calorias quemadas
    var caloriasQuemadas = pasos * CALORIAS_POR_PASO;

    // Mostramos los resultados
    System.out.printf("""
                      %nUsuario: %s
                      Pasos dados: %d
                      Calorías quemadas: %.2f kcal
                      meta de pasos diarios alcanzada: %d
                      ------------------------
                      La meta de pasos diarios es: %d
                      """, nombre, pasos, caloriasQuemadas, metaAlcanzada, META_PASOS);

  }
}