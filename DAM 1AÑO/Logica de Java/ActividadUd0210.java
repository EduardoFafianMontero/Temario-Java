import java.util.Scanner;

/*
 * Actividad UD02-10: Entrada básica por consola
 */
public class ActividadUd0210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Nota media de bachillerato (usa punto, ej. 7.5): ");
        double nota = Double.parseDouble(scanner.nextLine());

        System.out.println("Usuario: " + nombre + ", edad: " + edad + ", nota media: " + nota);

        scanner.close(); // 3) cerrar el Scanner al terminar
    }
}
