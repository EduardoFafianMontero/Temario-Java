import java.util.Scanner;

public class FMERestauranteUd02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] capacidades = {2, 2, 4, 4, 6, 8};
        String[] reservas = new String[6];   // todas las posiciones empiezan en null (mesa libre)
        int opcion = 0;

        do {
            System.out.println("\n1. Ver mesas");
            System.out.println("2. Reservar mesa");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Ver ocupación");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("La opción introducida no es correcta.");
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1:
                    verMesas(capacidades, reservas);
                    break;
                case 2:
                    reservarMesa(scanner, capacidades, reservas);
                    break;
                case 3:
                    cancelarReserva(scanner, reservas);
                    break;
                case 4:
                    verOcupacion(capacidades, reservas);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("La opción escogida debe ser un número del 1 al 5");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // ===== APARTADO A: búsqueda =====
    // Devuelve la mesa reservada a ese cliente, o -1 si no tiene reserva
    static int buscarReserva(String[] reservas, String cliente) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null && reservas[i].equalsIgnoreCase(cliente)) {
                return i;
            }
        }
        return -1;
    }

    // ===== APARTADO C: ver mesas =====
    static void verMesas(int[] capacidades, String[] reservas) {
        System.out.println("\n--- MAPA DE MESAS ---");
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                System.out.println("Mesa " + (i + 1) + " (" + capacidades[i] + " personas): LIBRE");
            } else {
                System.out.println("Mesa " + (i + 1) + " (" + capacidades[i] + " personas): Reservada a " + reservas[i]);
            }
        }
    }

    // ===== APARTADO D: reservar mesa =====

    // Devuelve la capacidad de la mesa más grande
    static int capacidadMaxima(int[] capacidades) {
        int max = capacidades[0];
        for (int i = 1; i < capacidades.length; i++) {
            if (capacidades[i] > max) {
                max = capacidades[i];
            }
        }
        return max;
    }

    static void reservarMesa(Scanner scanner, int[] capacidades, String[] reservas) {
        // 1. Nombre del cliente
        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine().trim();
        if (cliente.isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return;
        }

        // 2. Si ya tiene reserva, no puede reservar otra
        if (buscarReserva(reservas, cliente) != -1) {
            System.out.println("Ese cliente ya tiene una reserva.");
            return;
        }

        // 3. Comensales: tiene que ser un número
        int comensales;
        System.out.print("Número de comensales: ");
        try {
            comensales = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: los comensales deben ser un número.");
            return;
        }

        // 4. ... y estar entre 1 y la capacidad de la mesa más grande
        int max = capacidadMaxima(capacidades);
        if (comensales < 1 || comensales > max) {
            System.out.println("Error: los comensales deben estar entre 1 y " + max + ".");
            return;
        }

        // 5. Primera mesa libre con capacidad suficiente
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null && capacidades[i] >= comensales) {
                reservas[i] = cliente;
                System.out.println("Reserva realizada: " + cliente + " en la mesa " + (i + 1) + ".");
                return;   // salimos en cuanto la encontramos
            }
        }

        // 6. Si el bucle termina sin return, no había ninguna
        System.out.println("No hay ninguna mesa disponible para " + comensales + " personas.");
    }

    // ===== APARTADO E: cancelar y ocupación =====
    static void cancelarReserva(Scanner scanner, String[] reservas) {
        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine().trim();

        int pos = buscarReserva(reservas, cliente);
        if (pos == -1) {
            System.out.println("Error: ese cliente no tiene ninguna reserva.");
        } else {
            reservas[pos] = null;   // la mesa vuelve a quedar libre
            System.out.println("Reserva cancelada. La mesa " + (pos + 1) + " está libre.");
        }
    }

    // Devuelve cuántas personas caben en las mesas reservadas (no imprime nada)
    static int calcularPersonas(int[] capacidades, String[] reservas) {
        int total = 0;
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null) {
                total += capacidades[i];
            }
        }
        return total;
    }

    static void verOcupacion(int[] capacidades, String[] reservas) {
        int ocupadas = 0;
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null) {
                ocupadas++;
            }
        }
        int libres = reservas.length - ocupadas;

        System.out.println("Mesas ocupadas: " + ocupadas);
        System.out.println("Mesas libres: " + libres);
        System.out.println("Personas que caben en las mesas reservadas: " + calcularPersonas(capacidades, reservas));
    }
}