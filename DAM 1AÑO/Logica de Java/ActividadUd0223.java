import java.util.Scanner;

/*
 * Actividad UD02-23: Sentencia return
 */
public class ActividadUd0223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        // 1) Pedir números hasta que se introduzca uno negativo
        while (numero >= 0) {
            System.out.print("Introduce un número entero (negativo para salir): ");
            numero = Integer.parseInt(scanner.nextLine());

            if (numero < 0) {
                System.out.println("Error: has introducido un número negativo");
                scanner.close();
                return; // termina main inmediatamente: el resto del código NO se ejecuta
            }
            System.out.println("Número correcto: " + numero);
        }

        // Estas sentencias nunca se llegan a ejecutar, porque el único modo de salir
        // del bucle es el return de arriba.
        System.out.println("Fin del programa");
        System.out.println("Esto no se muestra");
        scanner.close();
    }
}

/*
 * 2) Diferencia entre break y return dentro de un bucle:
 *   - break: sale SOLO del bucle. El programa continúa con el código que hay
 *     justo después del bucle.
 *   - return: sale de TODO el método (aquí, main). Si es main, el programa
 *     termina y no se ejecuta nada más de lo que había debajo.
 */
