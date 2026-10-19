import java.util.Scanner;

/*
 * Autor: Eduardo Fafián Montero
 * Fecha: 19/10/2026
 * Descripción: Programa que pide por teclado el nombre de usuario, la edad y la
 *              nota media de bachillerato, y los muestra juntos en un mensaje.
 */
public class ActividadUd0211 {
    public static void main(String[] args) {
        // Creamos el Scanner para leer lo que escribe el usuario por teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre de usuario y lo guardamos
        System.out.print("Nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        // Pedimos la edad: se lee como texto y se convierte a entero
        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        // Pedimos la nota media: se lee como texto y se convierte a decimal
        System.out.print("Nota media de bachillerato (usa punto, ej. 7.5): ");
        double nota = Double.parseDouble(scanner.nextLine());

        // Mostramos los tres datos juntos en un único mensaje
        System.out.println("Usuario: " + nombre + ", edad: " + edad + ", nota media: " + nota);

        // Cerramos el Scanner para liberar el recurso
        scanner.close();
    }
}
