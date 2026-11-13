import java.util.Scanner;

public class PR02ValidacionDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return;
        }

        System.out.print("Edad: ");
        int edad;
        try {
            edad = Integer.parseInt(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: la edad debe ser un número entero.");
            return;
        }

        if (edad < 0 || edad > 120) {
            System.out.println("Error: la edad debe estar entre 0 y 120.");
            return;
        }

        String categoria;
        if (edad < 18) {
            categoria = "menor de edad";
        } else if (edad <= 65) {
            categoria = "adulta";
        } else {
            categoria = "mayor de 65 años";
        }

        System.out.println("¡Bienvenido/a, " + nombre.toUpperCase() + "! Eres " + categoria + ".");
        teclado.close();
    }
}
