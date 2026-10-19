import java.util.Scanner;

/*
 * Actividad UD02-18: Bucle do-while
 */
public class ActividadUd0218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clave;

        // 1) Pedir la contraseña hasta que sea la correcta
        do {
            System.out.print("Introduce la contraseña: ");
            clave = scanner.nextLine();
        } while (!clave.equals("1234"));

        System.out.println("Contraseña correcta");

        // 2) ¿Por qué do-while y no while?
        // Porque la contraseña hay que pedirla AL MENOS UNA VEZ antes de poder
        // comprobarla. El do-while ejecuta el cuerpo primero y evalúa la
        // condición después, así que no hace falta pedirla antes del bucle ni
        // inicializar la variable con un valor falso. Con while habría que
        // repetir el código de pedir la contraseña (o inventar un valor inicial).

        scanner.close();
    }
}
