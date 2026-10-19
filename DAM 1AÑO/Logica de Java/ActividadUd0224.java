import java.util.Scanner;

/*
 * Actividad UD02-24: Manipulación de cadenas de texto
 */
public class ActividadUd0224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Leer nombre y apellido y quitar espacios sobrantes (trim)
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().trim();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine().trim();
        scanner.close();

        // 2) Si alguno está vacío, error y fin del programa
        if (nombre.isEmpty() || apellido.isEmpty()) {
            System.out.println("Error: el nombre y el apellido no pueden estar vacíos");
            return;
        }

        // 3) Nombre completo, longitud, mayúsculas y minúsculas
        String completo = nombre + " " + apellido;
        System.out.println("Nombre completo: " + completo);
        System.out.println("Longitud: " + completo.length());
        System.out.println("Mayúsculas: " + completo.toUpperCase());
        System.out.println("Minúsculas: " + completo.toLowerCase());

        // 4) Nombre de usuario: primera letra del nombre + apellido, en minúsculas
        String usuario = (nombre.charAt(0) + apellido).toLowerCase();
        System.out.println("Usuario: " + usuario);

        // 5) Contar vocales (sin tilde) recorriendo carácter a carácter
        String minusculas = completo.toLowerCase();
        int vocales = 0;
        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("Vocales: " + vocales);

        // 6) Nombre completo al revés, desde la última posición hasta la primera
        String alReves = "";
        for (int i = completo.length() - 1; i >= 0; i--) {
            alReves += completo.charAt(i);
        }
        System.out.println("Al revés: " + alReves);

        // 7) ¿Contiene la letra "z"? y espacios sustituidos por guiones bajos
        System.out.println("¿Contiene la letra z? " + minusculas.contains("z"));
        System.out.println("Con guiones bajos: " + completo.replace(" ", "_"));
    }
}
