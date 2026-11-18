
import java.util.Scanner;

public class Registrodecompras {
    final static int NUM_PRODUCTOS = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = {"Teclado", "Ratón", "Monitor", "Webcam"};
        double[] precios = {25.50, 15.00, 149.99, 39.90};
        int[] stock = {10, 20, 5, 8};
        int opcion = 0;
        do {
            System.out.println("""
                    1. Mostrar poductos
                    2. Comprar producto
                    3. Salir
            """);
            try {
                opcion= Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("El dato introducio no es correcto");
                opcion = 0;
                continue;
            }
            switch (opcion){
                case 1 -> mostrarProductos(productos, precios, stock);
                case 2 -> comprarProductos(productos, precios, scanner, stock);
                case 3 -> System.out.println("Gracias por utiliza el programa");
                default -> System.out.println(" Dato incorrercto,introduce un dato entre el 1 y el 3");
            }
        }while (opcion !=3);
    }
    static int buscarProducto(String[] productos,String nombre){
        for (int i = 0; i <productos.length ; i++) {
            if (productos[i].equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }
    static void  mostrarProductos(String[] productos, double[] precios, int[] stock){
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("Producto:%s Precios:%.2f Stock:%d%n", productos[i],precios[i],stock[i]);
        }
    }
    static void comprarProductos(String[] productos, double[] precios, Scanner scanner, int[] stock) {
        System.out.println("¿Qué producto quieres comprar?");
        String nombre = scanner.nextLine();
        int posicion = buscarProducto(productos, nombre);

        if (posicion == -1) {
            System.out.println("Este producto no existe");
            return;
        }
        if (stock[posicion] == 0) {
            System.out.println("Este producto está agotado");
            return;
        }
        System.out.println("¿Cuántas unidades quieres comprar?");
        int cantidad;
        try {
            String entrada = scanner.nextLine();
            cantidad = Integer.parseInt(entrada);

        } catch (NumberFormatException e) {
            System.out.println("Debes introducir un número entero válido");
            return;
        }
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero");
            return;
        }
        if (cantidad > stock[posicion]) {
            System.out.println("No hay suficiente stock. Solo quedan "
                    + stock[posicion] + " unidades");
            return;
        }
        stock[posicion] -= cantidad;
        double total = cantidad * precios[posicion];
        System.out.printf(
                "Compra realizada: %s | Unidades: %d | Total: %.2f €%n",
                productos[posicion], cantidad, total
        );
    }
}
