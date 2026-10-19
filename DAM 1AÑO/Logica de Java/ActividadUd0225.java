import java.util.Scanner;

/*
 * Actividad UD02-25: Validación y comparación de textos
 * (todo se lee con nextLine() y se convierte después)
 */
public class ActividadUd0225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Constantes de acceso
        final String USUARIO = "admin";
        final String CLAVE = "Java2026";

        // 2) Tres intentos para iniciar sesión
        boolean acceso = false;
        for (int intento = 1; intento <= 3 && !acceso; intento++) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String clave = scanner.nextLine();

            // usuario sin distinguir mayúsculas; contraseña exacta
            if (usuario.equalsIgnoreCase(USUARIO) && clave.equals(CLAVE)) {
                acceso = true;
                System.out.println("Acceso concedido");
            } else if (intento < 3) {
                System.out.println("Datos incorrectos. Intentos restantes: " + (3 - intento));
            }
        }
        if (!acceso) {
            System.out.println("Acceso denegado");
            scanner.close();
            return;
        }

        // 3) Edad y precio, con 10 % de descuento si tiene 65 años o más
        System.out.print("Edad del cliente: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Precio del producto (usa punto, ej. 49.90): ");
        double precio = Double.parseDouble(scanner.nextLine());
        if (edad >= 65) {
            precio = precio * 0.90;
        }

        // 4) Precio final con printf y número de cifras de la edad
        System.out.printf("Precio final: %.2f €%n", precio);
        String edadTexto = String.valueOf(edad);
        System.out.println("La edad tiene " + edadTexto.length() + " cifras");

        // 5) Comparar dos nombres alfabéticamente (sin distinguir mayúsculas)
        System.out.print("Nombre del primer cliente: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Nombre del segundo cliente: ");
        String nombre2 = scanner.nextLine();
        int comparacion = nombre1.toLowerCase().compareTo(nombre2.toLowerCase());
        if (comparacion < 0) {
            System.out.println(nombre1 + " aparece primero por orden alfabético");
        } else if (comparacion > 0) {
            System.out.println(nombre2 + " aparece primero por orden alfabético");
        } else {
            System.out.println("Los dos nombres son iguales");
        }

        // 6) Confirmación de la compra (acepta "si" en cualquier combinación)
        System.out.print("¿Confirmas la compra? (si/no): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Compra confirmada");
        } else {
            System.out.println("Compra cancelada");
        }

        scanner.close();
    }
}
