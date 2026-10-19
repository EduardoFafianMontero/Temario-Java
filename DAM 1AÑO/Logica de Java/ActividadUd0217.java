import java.util.Scanner;

/*
 * Actividad UD02-17: Bucle while
 */
public class ActividadUd0217 {
    public static void main(String[] args) {
        // 1) Números del 1 al 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2) Pedir números hasta que se introduzca 0 y contar cuántos se han introducido
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;
        System.out.print("Introduce un número (0 para terminar): ");
        int numero = Integer.parseInt(scanner.nextLine());
        while (numero != 0) {
            cantidad++;
            System.out.print("Introduce un número (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Has introducido " + cantidad + " números (sin contar el 0)");

        scanner.close();
    }
}
