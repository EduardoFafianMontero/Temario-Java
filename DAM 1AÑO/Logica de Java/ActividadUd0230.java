import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Actividad UD02-30: Tipos de excepciones
 */
public class ActividadUd0230 {
    public static void main(String[] args) {
        // 1) InputMismatchException: nextInt() con texto en lugar de número
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Has introducido: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: eso no es un número entero");
        } finally {
            scanner.close();
        }

        // 2) ArrayIndexOutOfBoundsException: posición fuera de rango
        int[] numeros = {10, 20, 30};
        try {
            System.out.println(numeros[5]); // el array solo tiene posiciones 0, 1 y 2
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: la posición 5 no existe (el array tiene " + numeros.length + " elementos)");
        }

        // 3) NumberFormatException: convertir texto que no es un número
        String texto = "abc";
        try {
            int convertido = Integer.parseInt(texto);
            System.out.println(convertido);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + texto + "\" no es un número válido");
        }
    }
}
