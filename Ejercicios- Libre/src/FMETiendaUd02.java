import java.util.Scanner;

public class FMETiendaUd02 {
    static final int NUM_PRODUCTOS = 5;
    static final int STOCK_MINIMO = 3;
    static String[] nombres = {
            "Teclado",
            "Ratón",
            "Monitor",
            "Auriculares",
            "Webcam"
    };

    static int[] stock = {
            10, 5, 2, 8, 3
    };

    static double[] precios = {
            25.99, 15.50, 149.99, 39.90, 49.95
    };


    static int buscarProducto(String[] nombres, String nombre) {

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }

        return -1;
    }

    static int pedirEntero(Scanner sc, String mensaje, int min, int max) {

        int numero;

        while (true) {

            try {

                System.out.print(mensaje);
                numero = Integer.parseInt(sc.nextLine().trim());

                if (numero >= min && numero <= max) {
                    return numero;
                }

                System.out.println("El número debe estar entre " + min + " y " + max + ".");

            } catch (NumberFormatException e) {

                System.out.println("Debes introducir un número entero.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("""

                    1. Ver inventario
                    2. Vender un producto
                    3. Reponer stock
                    4. Productos con poco stock
                    5. Valor total del almacén
                    6. Salir
                    """);
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("La opción introducida no es correcta.");
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1 -> verInventario(nombres, stock, precios);
                case 2 -> venderProducto(nombres, stock, precios, scanner);
                case 3 -> reponerStock(nombres, stock, scanner);
                case 4 -> productosPocoStock(nombres, stock);
                case 5 -> System.out.printf("Valor total del almacén: %.2f €%n",
                        calcularValorTotal(stock, precios));
                case 6 -> System.out.println("Gracias por utilizar el programa.");
                default -> System.out.println("La opción debe ser un número del 1 al 6.");
            }
        } while (opcion != 6);
        scanner.close();
    }

    // ==========================================================
    // APARTADO C. VER INVENTARIO
    // ==========================================================
    // Recorre los tres arrays paralelos con un solo bucle: la posición i
    // es el mismo producto en nombres, stock y precios.
    static void verInventario(String[] nombres, int[] stock, double[] precios) {
        System.out.println("\n--- INVENTARIO ---");
        for (int i = 0; i < nombres.length; i++) {
            double valor = stock[i] * precios[i];   // valor de ese producto en almacén
            System.out.printf("%-12s Stock: %3d  Precio: %7.2f €  Valor: %8.2f €",
                    nombres[i], stock[i], precios[i], valor);

            // Si queda poco stock, avisamos al final de la línea
            if (stock[i] < STOCK_MINIMO) {
                System.out.print("  ¡REPONER!");
            }
            System.out.println();   // salto de línea para el siguiente producto
        }
    }

    // ==========================================================
    // APARTADO D. VENDER Y REPONER
    // ==========================================================

    // Pide un nombre y lo valida (apartado F): sin espacios sobrantes,
    // no vacío y sin números. Devuelve el nombre, o null si no es válido.
    static String pedirNombre(Scanner sc) {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine().trim();   // trim() quita espacios al principio y al final

        if (nombre.isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return null;
        }
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isDigit(nombre.charAt(i))) {
                System.out.println("Error: el nombre no puede contener números.");
                return null;
            }
        }
        return nombre;
    }

    // Vender: busca el producto, pide las unidades y comprueba que hay stock.
    // El orden de las comprobaciones es importante: primero lo que puede
    // fallar antes de modificar nada.
    static void venderProducto(String[] nombres, int[] stock, double[] precios, Scanner sc) {
        String nombre = pedirNombre(sc);
        if (nombre == null) {
            return;   // el error ya se ha mostrado
        }

        int pos = buscarProducto(nombres, nombre);
        if (pos == -1) {
            System.out.println("Error: el producto no existe.");
            return;
        }

        int unidades = pedirEntero(sc, "Unidades a vender: ", 1, 1000);
        if (unidades > stock[pos]) {
            System.out.println("No hay suficiente stock: solo quedan " + stock[pos] + " unidades.");
            return;
        }

        stock[pos] -= unidades;                    // restamos del almacén
        double importe = unidades * precios[pos];  // lo que paga el cliente
        System.out.printf("Venta realizada: %d x %s = %.2f €%n", unidades, nombres[pos], importe);
        System.out.println("(El nombre tiene " + contarVocales(nombres[pos], 0) + " vocales)");
    }

    // Reponer: igual que vender, pero sumando. No hay límite de stock máximo.
    static void reponerStock(String[] nombres, int[] stock, Scanner sc) {
        String nombre = pedirNombre(sc);
        if (nombre == null) {
            return;
        }

        int pos = buscarProducto(nombres, nombre);
        if (pos == -1) {
            System.out.println("Error: el producto no existe.");
            return;
        }

        int unidades = pedirEntero(sc, "Unidades a reponer: ", 1, 1000);
        stock[pos] += unidades;
        System.out.println("Stock actualizado: " + nombres[pos] + " tiene ahora " + stock[pos] + " unidades.");
    }

    // ==========================================================
    // APARTADO E. CONSULTAS
    // ==========================================================

    // Muestra solo los productos con stock por debajo del mínimo.
    // La variable "hay" recuerda si hemos encontrado al menos uno.
    static void productosPocoStock(String[] nombres, int[] stock) {
        System.out.println("\n--- PRODUCTOS CON POCO STOCK ---");
        boolean hay = false;
        for (int i = 0; i < nombres.length; i++) {
            if (stock[i] < STOCK_MINIMO) {
                System.out.println(nombres[i] + ": " + stock[i] + " unidades");
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("No hay ningún producto con poco stock.");
        }
    }

    // Suma stock × precio de todos los productos y DEVUELVE el total.
    // No imprime nada: quien la llama (el main) decide cómo mostrarlo.
    static double calcularValorTotal(int[] stock, double[] precios) {
        double total = 0;
        for (int i = 0; i < stock.length; i++) {
            total += stock[i] * precios[i];
        }
        return total;
    }

    // ==========================================================
    // APARTADO F. RECURSIÓN
    // ==========================================================
    // Cuenta las vocales de un texto SIN bucles: mira el carácter de la
    // posición "pos" y se llama a sí mismo con la siguiente posición.
    static int contarVocales(String texto, int pos) {
        // Caso base: si hemos pasado del final, no quedan letras por mirar
        if (pos == texto.length()) {
            return 0;
        }
        char c = Character.toLowerCase(texto.charAt(pos));
        int esVocal = "aeiouáéíóú".indexOf(c) >= 0 ? 1 : 0;   // 1 si es vocal, 0 si no

        // Caso recursivo: esta letra + las vocales del resto del texto
        return esVocal + contarVocales(texto, pos + 1);
    }
}