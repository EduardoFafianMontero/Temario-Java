import java.util.Scanner;

public class PR05ValidadorPassword {

    // Devuelve 0 si es segura; 1, 2 o 3 según la condición incumplida
    public static int esSegura(String contrasena) {
        if (contrasena.length() < 8) {
            return 1;
        }

        boolean hayDigito = false;
        boolean hayEspacio = false;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (c >= '0' && c <= '9') {
                hayDigito = true;
            }
            if (c == ' ') {
                hayEspacio = true;
            }
        }

        if (!hayDigito) {
            return 2;
        }
        if (hayEspacio) {
            return 3;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean terminado = false;

        while (!terminado) {
            System.out.print("Introduce una contraseña (o 'salir'): ");
            String contrasena = teclado.nextLine();

            if (contrasena.equals("salir")) {
                System.out.println("Hasta luego.");
                terminado = true;
            } else {
                int resultado = esSegura(contrasena);
                switch (resultado) {
                    case 0:
                        System.out.println("Contraseña segura.");
                        terminado = true;
                        break;
                    case 1:
                        System.out.println("No es segura: debe tener 8 o más caracteres.");
                        break;
                    case 2:
                        System.out.println("No es segura: debe contener al menos un dígito.");
                        break;
                    case 3:
                        System.out.println("No es segura: no puede contener espacios en blanco.");
                        break;
                }
            }
        }
        teclado.close();
    }
}
