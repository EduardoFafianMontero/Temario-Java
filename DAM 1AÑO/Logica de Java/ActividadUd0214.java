import java.util.Scanner;

/*
 * Actividad UD02-14: Condicionales: if, if-else, if-else if-else
 */
public class ActividadUd0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Positivo, negativo o cero
        System.out.print("1) Introduce un número entero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        // 2) Calificación según la nota (0-10)
        System.out.print("2) Introduce una nota (0-10, con punto decimal): ");
        double nota = Double.parseDouble(scanner.nextLine());
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida (debe estar entre 0 y 10)");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 6) {
            System.out.println("Aprobado");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        // 3) Mayor de tres números
        System.out.print("3) Primer número: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("   Segundo número: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("   Tercer número: ");
        int c = Integer.parseInt(scanner.nextLine());

        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        System.out.println("El mayor es: " + mayor);

        scanner.close();
    }
}
