import java.util.Scanner;

public class PR04Inventario {

    // Devuelve la posición del producto o -1 si no existe
    public static int buscarProducto(String[] productos, String nombreBuscado) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] productos = {"Tabla de surf", "Neopreno", "Leash", "Parafina", "Casco"};
        double[] precios = {450.00, 120.50, 25.99, 3.75, 59.90};

        System.out.println("=== INVENTARIO ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%-15s %10.2f €%n", productos[i], precios[i]);
        }

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nProducto a buscar: ");
        String nombre = teclado.nextLine().trim();

        int posicion = buscarProducto(productos, nombre);
        if (posicion != -1) {
            System.out.printf("El precio de %s es %.2f €%n", productos[posicion], precios[posicion]);
        } else {
            System.out.println("Producto no encontrado.");
        }

        double total = 0;
        for (double precio : precios) {
            total += precio;
        }
        System.out.printf("Valor total del inventario: %.2f €%n", total);
        teclado.close();
    }
}
