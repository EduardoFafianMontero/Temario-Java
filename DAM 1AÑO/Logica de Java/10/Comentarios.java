import java.util.Scanner;

/*
 * Nombre: Edufafi
 * Fecha: 12/10/2026
 * Descripción: Programa que pide por teclado el nombre de usuario, la edad
 *              y la nota media de bachillerato, y los muestra en un único mensaje.
 */
public class Comentarios {
    public static void main(String[] args) {
        // Creamos el Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos y leemos el nombre de usuario
        System.out.print("Introduce tu nombre de usuario: ");
        String nombre = scanner.nextLine();

        // Pedimos y leemos la edad como número entero
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Pedimos y leemos la nota media como número decimal
        System.out.print("Introduce tu nota media de bachillerato: ");
        double notaMedia = scanner.nextDouble();

        // Mostramos los tres datos juntos en un único mensaje
        System.out.println("Usuario: " + nombre + ", edad: " + edad + ", nota media: " + notaMedia);

        // Cerramos el Scanner para liberar el recurso
        scanner.close();
    }
}
