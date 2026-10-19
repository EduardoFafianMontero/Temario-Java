import java.util.Scanner;

/*
 * Actividad UD02-31: Buenas prácticas en manejo de excepciones
 *
 * 1) Problemas del código original:
 *    - catch (Exception e): demasiado genérico, captura cualquier error sin
 *      distinguir de qué tipo es (número mal escrito, división entre 0...).
 *    - catch VACÍO: se "traga" el error. El programa falla en silencio y el
 *      usuario no sabe qué ha pasado.
 *    - Sin mensaje claro para el usuario.
 *    - El Scanner nunca se cierra.
 *    - Dos errores posibles distintos (NumberFormatException y
 *      ArithmeticException) tratados igual.
 *
 * Código original (comentado):
 *   try {
 *       int numero = Integer.parseInt(texto);
 *       System.out.println(100 / numero);
 *   } catch (Exception e) {
 *   }
 */
public class ActividadUd0231 {
    public static void main(String[] args) {
        // 2) Versión corregida (try-with-resources cierra el Scanner solo)
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número: ");
            String texto = scanner.nextLine();

            try {
                int numero = Integer.parseInt(texto);
                System.out.println(100 / numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: \"" + texto + "\" no es un número entero válido");
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre cero");
            }
        }
    }
}
