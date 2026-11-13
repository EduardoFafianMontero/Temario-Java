import java.util.Scanner;

public class PR11VerificacionPin {

    private static final String PIN_CORRECTO = "1234"; // global (constante)
    private static final int MAX_INTENTOS = 3;         // global (constante)

    public static boolean comprobarPin(String pin) { // pin: parámetro
        return pin.equals(PIN_CORRECTO);
    }

    public static void mostrarIntentosRestantes(int intentos) { // intentos: parámetro
        int restantes = MAX_INTENTOS - intentos; // restantes: local
        System.out.println("Intentos restantes: " + restantes);
    }

    public static void main(String[] args) { // args: parámetro
        Scanner teclado = new Scanner(System.in); // teclado: local
        int intentos = 0;                         // intentos: local
        boolean accesoPermitido = false;          // accesoPermitido: local

        while (!accesoPermitido && intentos < MAX_INTENTOS) {
            System.out.print("Introduce el PIN: ");
            String pin = teclado.nextLine().trim(); // pin: local

            if (comprobarPin(pin)) {
                accesoPermitido = true;
            } else {
                intentos++;
                System.out.println("PIN incorrecto.");
                mostrarIntentosRestantes(intentos);
            }
        }

        if (accesoPermitido) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Tarjeta bloqueada");
        }
        teclado.close();
    }
}
