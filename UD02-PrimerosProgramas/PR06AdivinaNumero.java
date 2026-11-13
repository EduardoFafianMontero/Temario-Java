import java.util.Scanner;

public class PR06AdivinaNumero {
    public static void main(String[] args) {
        final int NUMERO_SECRETO = 42;
        final int INTENTOS_MAXIMOS = 5;

        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        boolean acertado = false;

        System.out.println("Adivina el número (entre 1 y 100). Tienes " + INTENTOS_MAXIMOS + " intentos.");

        // while: puede que no se llegue a entrar si no hubiese intentos
        while (intentos < INTENTOS_MAXIMOS) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int numero;
            try {
                numero = Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido (no se cuenta el intento).");
                continue;
            }
            intentos++;

            if (numero == NUMERO_SECRETO) {
                acertado = true;
                System.out.println("¡Correcto!");
                break;
            } else if (numero > NUMERO_SECRETO) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("Demasiado bajo.");
            }
        }

        if (acertado) {
            System.out.println("¡Has ganado en " + intentos + " intentos!");
        } else {
            System.out.println("Has perdido. El número secreto era " + NUMERO_SECRETO + ".");
        }
        teclado.close();
    }
}
