import java.util.Scanner;

public class VentaEntradasProgram {

    // Constantes del programa
    static final int NUM_BUTACAS = 20;
    static final double PRECIO_ENTRADA = 18.50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // butacas[0] es la butaca 1, butacas[19] es la butaca 20.
        // null = libre, si no null = guarda el DNI del comprador.
        String[] butacas = new String[NUM_BUTACAS];

        int opcion = 0;
        do {
            System.out.println("\n===== VENTA DE ENTRADAS =====");
            System.out.println("1. Ver mapa de butacas");
            System.out.println("2. Comprar una entrada");
            System.out.println("3. Cancelar una entrada");
            System.out.println("4. Buscar las entradas de un comprador");
            System.out.println("5. Ver recaudación total");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0; // opción no válida
            }

            switch (opcion) {
                case 1:
                    mostrarMapaButacas(butacas);
                    break;
                case 2:
                    comprarEntrada(butacas, sc);
                    break;
                case 3:
                    cancelarEntrada(butacas, sc);
                    break;
                case 4:
                    buscarPorComprador(butacas, sc);
                    break;
                case 5:
                    double total = calcularRecaudacion(butacas);
                    System.out.println("Recaudación total: " + total + " €");
                    break;
                case 6:
                    System.out.println("¡Gracias por usar el programa! Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 6.");
            }
        } while (opcion != 6);

        sc.close(); // Se cierra una sola vez, al final
    }

    // Muestra cada butaca: libre u ocupada (con el DNI)
    public static void mostrarMapaButacas(String[] butacas) {
        System.out.println("\n--- MAPA DE BUTACAS ---");
        for (int i = 0; i < butacas.length; i++) {
            if (butacas[i] == null) {
                System.out.println("Butaca " + (i + 1) + ": LIBRE");
            } else {
                System.out.println("Butaca " + (i + 1) + ": OCUPADA (DNI: " + butacas[i] + ")");
            }
        }
    }
  
    // Pide una butaca y la valida (número y rango).
    // Devuelve la posición en el array (0-19) o -1 si hay error.
    public static int pedirButaca(Scanner sc) {
        System.out.print("Número de butaca (1-" + NUM_BUTACAS + "): ");
        try {
            int numero = Integer.parseInt(sc.nextLine());
            if (numero < 1 || numero > NUM_BUTACAS) {
                System.out.println("Error: la butaca debe estar entre 1 y " + NUM_BUTACAS + ".");
                return -1;
            }
            return numero - 1;
        } catch (NumberFormatException e) {
            System.out.println("Error: debes introducir un número, no texto.");
            return -1;
        }
    }

    // Comprueba que el DNI tenga 8 dígitos y una letra A-Z
    public static boolean dniValido(String dni) {
        if (dni.length() != 9) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        char letra = dni.charAt(8);
        return letra >= 'A' && letra <= 'Z';
    }

    public static void comprarEntrada(String[] butacas, Scanner sc) {
        int pos = pedirButaca(sc);
        if (pos == -1) {
            return; // ya se mostró el error
        }

        if (butacas[pos] != null) {
            System.out.println("La butaca " + (pos + 1) + " ya está ocupada. No se realiza la venta.");
            return;
        }

        System.out.print("DNI del comprador (8 dígitos y letra): ");
        String dni = sc.nextLine().trim().toUpperCase();

        if (!dniValido(dni)) {
            System.out.println("Error: el DNI no tiene un formato correcto.");
            return;
        }

        butacas[pos] = dni;
        System.out.println("Compra realizada. Butaca " + (pos + 1) + " para " + dni
                + ". Precio: " + PRECIO_ENTRADA + " €");
    }

    public static void cancelarEntrada(String[] butacas, Scanner sc) {
        int pos = pedirButaca(sc);
        if (pos == -1) {
            return;
        }

        if (butacas[pos] == null) {
            System.out.println("No había ninguna entrada que cancelar en la butaca " + (pos + 1) + ".");
        } else {
            butacas[pos] = null;
            System.out.println("Entrada de la butaca " + (pos + 1) + " cancelada. Vuelve a estar libre.");
        }
    }

    public static void buscarPorComprador(String[] butacas, Scanner sc) {
        System.out.print("DNI a buscar: ");
        String dni = sc.nextLine().trim().toUpperCase();

        boolean encontrado = false;
        for (int i = 0; i < butacas.length; i++) {
            if (butacas[i] != null && butacas[i].equals(dni)) {
                System.out.println("El DNI " + dni + " tiene la butaca " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ninguna entrada para el DNI " + dni);
        }
    }

    // Cuenta las butacas ocupadas y multiplica por el precio
    public static double calcularRecaudacion(String[] butacas) {
        int ocupadas = 0;
        for (String butaca : butacas) {
            if (butaca != null) {
                ocupadas++;
            }
        }
        return ocupadas * PRECIO_ENTRADA;
    }
}