
import java.util.Scanner;

public class RepasoGesionbibliotecas {
    static final int NUM_PRODUCTOS = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = {
                "Teclado",
                "Ratón",
                "Monitor",
                "Auriculares",
                "Webcam"
        };
        int[] stock = {15, 20, 8, 12, 5};
        int[] vendidos = {5, 8, 3, 4, 2};
        int opcion = 0;
        do {
            System.out.println("""
                    ====== Gestión de Tienda ======
                    1. Ver productos
                    2. Registrar venta
                    3. Reponer stock
                    4. Mostrar estadísticas
                    5. Salir
                    """);

            try {
                opcion = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("La opción introducida no es correcta");
                opcion = 0;
                continue;
            }
            switch (opcion) {
                case 1 -> verProductos(nombres, stock, vendidos);
                case 2 -> registrarVentas(nombres, stock, vendidos, scanner);
                case 3 -> reponeStock(nombres, stock, vendidos, scanner);
                case 4 -> mostrarEstadisticas(nombres, stock, vendidos);
                case 5 -> System.out.println("Gracias por utilizar el programa");
                default -> System.out.println("Vuelve a introducir una opción");
            }
        } while (opcion != 5);
        scanner.close();
    }
    static int buscarProducto(String[] nombres, String nombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    static void verProductos(String[] nombres, int[] stock, int[] vendidos) {
        for (int i = 0; i < nombres.length; i++) {
            int disponibles = stock[i] - vendidos[i];
            if (disponibles == 0) {
                System.out.printf(
                        "%-15s Stock: %d Vendidos: %d Disponibles: %d SIN STOCK%n",
                        nombres[i], stock[i], vendidos[i], disponibles
                );
            } else {
                System.out.printf(
                        "%-15s Stock: %d Vendidos: %d Disponibles: %d%n",
                        nombres[i], stock[i], vendidos[i], disponibles
                );
            }
        }
    }
    static void registrarVentas(String[] nombres, int[] stock, int[] vendidos, Scanner scanner) {
        System.out.println("Escribe el nombre del producto:");
        String nombre = scanner.nextLine().trim();
        int indice = buscarProducto(nombres, nombre);
        if (indice == -1) {
            System.out.println("El producto no existe");
            return;
        }
        int disponibles = stock[indice] - vendidos[indice];
        if (disponibles == 0) {
            System.out.println("No quedan unidades");
            return;
        }
        System.out.println("¿Cuántas unidades quieres vender?");
        int cantidad = Integer.parseInt(scanner.nextLine());
        if (cantidad <= 0 || cantidad > disponibles) {
            System.out.println("Cantidad no válida");
            return;
        }
        vendidos[indice] += cantidad;
        System.out.println("Venta realizada correctamente");
        System.out.println("Producto: " + nombres[indice]);
        System.out.println("Unidades vendidas: " + cantidad);
        System.out.println("Unidades disponibles: " +
                (stock[indice] - vendidos[indice]));
    }
    static void reponeStock(String[] nombres, int[] stock, int[] vendidos, Scanner scanner) {
        System.out.println("Escribe el nombre del producto:");
        String nombre = scanner.nextLine().trim();
        int indice = buscarProducto(nombres, nombre);
        if (indice == -1) {
            System.out.println("El producto no existe");
            return;
        }
        System.out.println("¿Cuántas unidades reponer?");
        int cantidad = Integer.parseInt(scanner.nextLine());
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida");
            return;
        }
        stock[indice] += cantidad;
        System.out.println("Stock repuesto correctamente");
        System.out.println("Producto: " + nombres[indice]);
        System.out.println("Nuevo stock: " + stock[indice]);
    }
    static void mostrarEstadisticas(String[] nombres, int[] stock, int[] vendidos) {
        int totalStock = 0;
        int totalVendido = 0;
        int maxVendidos = -1;
        int indiceMaximo = -1;
        for (int i = 0; i < nombres.length; i++) {

            totalStock += stock[i];
            totalVendido += vendidos[i];

            if (vendidos[i] > maxVendidos) {
                maxVendidos = vendidos[i];
                indiceMaximo = i;
            }
        }
        int totalDisponibles = totalStock - totalVendido;
        System.out.println("Total de unidades en stock: " + totalStock);
        System.out.println("Total de unidades vendidas: " + totalVendido);
        System.out.println("Total de unidades disponibles: " + totalDisponibles);
        System.out.println("Producto más vendido: " +
                nombres[indiceMaximo] + " (" + maxVendidos + " unidades)");
    }
}

