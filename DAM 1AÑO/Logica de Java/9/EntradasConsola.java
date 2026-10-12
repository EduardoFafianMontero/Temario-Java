import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nombre de usuario
        System.out.print("Introduce tu nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        // 2. Edad (entero) y nota media de bachillerato (decimal)
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Ojo: con configuración regional española el decimal se escribe con coma (8,5)
        System.out.print("Introduce tu nota media de bachillerato: ");
        double notaMedia = scanner.nextDouble();

        System.out.println("Usuario: " + nombre + ", edad: " + edad + ", nota media: " + notaMedia);

        // 3. Cerrar el Scanner al terminar
        scanner.close();
    }
}
