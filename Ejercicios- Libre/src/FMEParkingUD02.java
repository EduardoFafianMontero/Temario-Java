import java.util.Scanner;

public class FMEParkingUD02 {
    // Constantes del programa
    static final int NUM_PLAZAS = 6;
    static final double PRECIO_HORA = 1.50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matriculas = new String[NUM_PLAZAS];   // null = plaza libre
        int[] horasEntrada = new int[NUM_PLAZAS];

        int opcion = 0;
        do {
            System.out.println("\n1. Ver plazas de garaje");
            System.out.println("2. Entrar un coche");
            System.out.println("3. Salir un coche");
            System.out.println("4. Ver ocupación");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("La opción introducida no es correcta.");
                opcion = 0;
                continue;   // vuelve al menú sin pasar por el switch
            }

            switch (opcion) {
                case 1 -> verPlazas(matriculas, horasEntrada);
                case 2 -> entrarCoche(matriculas, horasEntrada, sc);
                case 3 -> salirCoche(matriculas, horasEntrada, sc);
                case 4 -> verOcupacion(matriculas);
                case 5 -> System.out.println("Gracias por usar el programa.");
                default -> System.out.println("La opción debe ser un número del 1 al 5.");
            }
        } while (opcion != 5);
        sc.close();
    }

    // ===== APARTADO A: búsquedas =====

    // Devuelve la posición del coche, o -1 si no está
    static int buscarCoche(String[] matriculas, String matricula) {
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i] != null && matriculas[i].equals(matricula)) {
                return i;
            }
        }
        return -1;
    }

    // Devuelve la primera plaza libre, o -1 si el parking está lleno
    static int buscarPlazaLibre(String[] matriculas) {
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // ===== Métodos auxiliares =====

    // 4 dígitos seguidos de 3 letras mayúsculas
    static boolean matriculaValida(String m) {
        if (m.length() != 7) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(m.charAt(i))) {
                return false;
            }
        }
        for (int i = 4; i < 7; i++) {
            char c = m.charAt(i);
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        return true;
    }

    // Pide una hora (0-23). Devuelve -1 si es inválida
    static int pedirHora(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        try {
            int hora = Integer.parseInt(sc.nextLine().trim());
            if (hora < 0 || hora > 23) {
                System.out.println("Error: la hora debe estar entre 0 y 23.");
                return -1;
            }
            return hora;
        } catch (NumberFormatException e) {
            System.out.println("Error: debes introducir un número, no texto.");
            return -1;
        }
    }

    static double calcularImporte(int horas) {
        return horas * PRECIO_HORA;
    }

    // ===== APARTADO C: ver plazas =====
    static void verPlazas(String[] matriculas, int[] horasEntrada) {
        System.out.println("\n--- MAPA DEL GARAJE ---");
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i] == null) {
                System.out.println("Plaza " + (i + 1) + ": LIBRE");
            } else {
                System.out.println("Plaza " + (i + 1) + ": " + matriculas[i]
                        + " (entró a las " + horasEntrada[i] + "h)");
            }
        }
    }

    // ===== APARTADO D: entrar un coche =====
    static void entrarCoche(String[] matriculas, int[] horasEntrada, Scanner sc) {
        System.out.print("Matrícula (4 números y 3 letras mayúsculas): ");
        String matricula = sc.nextLine().trim().toUpperCase();

        if (!matriculaValida(matricula)) {
            System.out.println("Error: la matrícula no tiene un formato correcto.");
            return;
        }
        if (buscarCoche(matriculas, matricula) != -1) {
            System.out.println("Ese coche ya está dentro del parking.");
            return;
        }
        int plaza = buscarPlazaLibre(matriculas);
        if (plaza == -1) {
            System.out.println("El parking está lleno.");
            return;
        }
        int hora = pedirHora(sc, "Hora de entrada (0-23): ");
        if (hora == -1) {
            return;   // el error ya se ha mostrado
        }

        matriculas[plaza] = matricula;
        horasEntrada[plaza] = hora;
        System.out.println("Coche " + matricula + " aparcado en la plaza " + (plaza + 1) + ".");
    }

    // ===== APARTADO E: salir un coche =====
    static void salirCoche(String[] matriculas, int[] horasEntrada, Scanner sc) {
        System.out.print("Matrícula del coche que sale: ");
        String matricula = sc.nextLine().trim().toUpperCase();

        int plaza = buscarCoche(matriculas, matricula);
        if (plaza == -1) {
            System.out.println("Error: ese coche no está en el parking.");
            return;
        }
        int horaSalida = pedirHora(sc, "Hora de salida (0-23): ");
        if (horaSalida == -1) {
            return;
        }
        if (horaSalida < horasEntrada[plaza]) {
            System.out.println("Error: la hora de salida no puede ser anterior a la de entrada.");
            return;
        }

        int horas = horaSalida - horasEntrada[plaza];
        double importe = calcularImporte(horas);
        System.out.printf("Coche %s: %d hora(s). Importe a pagar: %.2f €%n", matricula, horas, importe);

        matriculas[plaza] = null;   // la plaza vuelve a quedar libre
        horasEntrada[plaza] = 0;
    }

    // ===== APARTADO F: ocupación =====
    static void verOcupacion(String[] matriculas) {
        int ocupadas = 0;
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i] != null) {
                ocupadas++;
            }
        }
        int libres = matriculas.length - ocupadas;
        double porcentaje = ocupadas * 100.0 / matriculas.length;
        System.out.printf("Ocupadas: %d | Libres: %d | Ocupación: %.1f%%%n", ocupadas, libres, porcentaje);
    }
}
