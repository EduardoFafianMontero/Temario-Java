
import java.util.Scanner;

public class GestionDeUnGimnasio {
    final static int NUM_ACTIVIDADES = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] actividades = {"Crossfit", "Yoga", "Spinning", "Pilates"};
        int[] plazasTotales = {15, 12, 20, 10};
        int[] plazasOcupadas = {10, 5, 20, 3};
        double[] precios = {35.00, 25.00, 30.00, 28.00};
        int opcion = 0;
        do {
            System.out.println("""
                    1. Mostrar actividades
                    2. Inscribir cliente
                    3. Mostrar estadísticas
                    4. Salir
                    """);
            try {
                opcion = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Dato incorrecto");
                opcion = 0;
                continue;
            }
            switch (opcion) {
                case 1 -> mostrarActividades(actividades, plazasTotales, plazasOcupadas, precios);
                case 2 -> inscribirCliente(actividades, plazasTotales, plazasOcupadas, precios, scanner);
                case 3 -> mostrarEstadisticas(actividades, plazasTotales, plazasOcupadas, precios);
                case 4 -> System.out.println("Gracias por utilizar este programa");
                default -> System.out.println("Introduce un número entre 1 y 4");
            }
        } while (opcion != 4);
        scanner.close();
    }
    // APARTADO B: Buscar actividad
    static int buscarActividad(String[] actividades, String nombre) {
        for (int i = 0; i < actividades.length; i++) {
            if (actividades[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    // APARTADO C: Mostrar actividades
    static void mostrarActividades(String[] actividades, int[] plazasTotales, int[] plazasOcupadas, double[] precios) {
        for (int i = 0; i < actividades.length; i++) {
            int disponibles = plazasTotales[i] - plazasOcupadas[i];
            System.out.printf(
                    "Nombre: %s | Precio: %.2f € | Plazas totales: %d | Plazas ocupadas: %d | Disponibles: %d%n",
                    actividades[i],
                    precios[i],
                    plazasTotales[i],
                    plazasOcupadas[i],
                    disponibles
            );
        }
    }
    // APARTADO D: Inscribir cliente
    static void inscribirCliente(String[] actividades, int[] plazasTotales, int[] plazasOcupadas, double[] precios, Scanner scanner) {
        System.out.println("¿A qué actividad quieres inscribirte?");
        String nombre = scanner.nextLine();
        int posicion = buscarActividad(actividades, nombre);
        if (posicion == -1) {
            System.out.println("Esta actividad no existe");
            return;
        }
        int disponibles = plazasTotales[posicion] - plazasOcupadas[posicion];
        if (disponibles <= 0) {
            System.out.println("Esta actividad está completa");
            return;
        }
        System.out.println("¿Cuántas plazas quieres reservar?");
        int cantidad;
        try {
            cantidad = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Debes introducir un número entero válido");
            return;
        }
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero");
            return;
        }
        if (cantidad > disponibles) {
            System.out.println("No hay suficientes plazas. Disponibles: " + disponibles);
            return;
        }
        plazasOcupadas[posicion] += cantidad;
        double total = cantidad * precios[posicion];
        System.out.printf(
                "Inscripción realizada: %s | Plazas: %d | Total: %.2f €%n",
                actividades[posicion],
                cantidad,
                total
        );
    }
    // APARTADO E: Mostrar estadísticas
    static void mostrarEstadisticas(String[] actividades, int[] plazasTotales, int[] plazasOcupadas, double[] precios) {
        int totalOcupadas = 0;
        int totalPlazas = 0;
        int maxOcupadas = 0;
        int posicionMaxima = 0;
        for (int i = 0; i < actividades.length; i++) {
            totalOcupadas += plazasOcupadas[i];
            totalPlazas += plazasTotales[i];
            if (plazasOcupadas[i] > maxOcupadas) {
                maxOcupadas = plazasOcupadas[i];
                posicionMaxima = i;
            }
        }
        int disponibles = totalPlazas - totalOcupadas;
        double porcentaje = (double) totalOcupadas / totalPlazas * 100;
        System.out.println("----- ESTADÍSTICAS DEL GIMNASIO -----");
        System.out.println("Plazas ocupadas: " + totalOcupadas);
        System.out.println("Plazas disponibles: " + disponibles);
        System.out.println("Actividad con más plazas ocupadas: " + actividades[posicionMaxima]);
        System.out.printf("Porcentaje de ocupación: %.2f%%%n", porcentaje);
    }
}
