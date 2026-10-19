import java.util.Scanner;

/*
 * Actividad UD02-19: Bucle for
 */
public class ActividadUd0219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Tabla de multiplicar del 1 al 10
        System.out.print("Número para la tabla de multiplicar: ");
        int numero = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // 2) Factorial de un número
        System.out.print("Número para calcular el factorial: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 0) {
            System.out.println("El factorial no existe para números negativos");
        } else {
            long factorial = 1; // long: el factorial crece muy rápido
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        scanner.close();
    }
}
