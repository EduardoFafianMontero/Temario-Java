import java.util.Scanner;

/*
 * Actividad UD02-29: Tratamiento de excepciones
 *
 * 2) Antes de añadir el try-catch, al introducir 0 como segundo número el
 *    programa se detenía con:
 *      Exception in thread "main" java.lang.ArithmeticException: / by zero
 */
public class ActividadUd0229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Primer número: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Segundo número: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("Resultado: " + (a / b)); // 1) división
        } catch (ArithmeticException e) {
            // 3) El programa no se detiene: muestra un mensaje
            System.out.println("Error: no se puede dividir entre cero");
        } finally {
            // 4) Se ejecuta SIEMPRE, haya error o no
            System.out.println("Fin del programa");
            scanner.close();
        }
    }
}
