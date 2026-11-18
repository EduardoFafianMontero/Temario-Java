import java.util.Scanner;

public class FMEGimnasioUd02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Declaración de arrays paralelos
        String[] clases = {"Yoga", "Pilates", "Spinning", "Zumba", "Boxeo"};
        int[] plazasTotales = {10, 15, 8, 20, 12};
        int[] plazasOcupadas = new int[clases.length];
        int opcion = 0;
        do {
            System.out.println("""
                    1. Ver clases
                    2. Apuntarse a una clase
                    3. Darse de baja
                    4. Estadisticas
                    5. Salir
            """);
            try {
                opcion= Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("La opción introducida no es correcta.");
                opcion = 0;
                continue;
            }
            switch (opcion) {
                case 1 -> verclases(clases, plazasTotales, plazasOcupadas);
                case 2 -> apuntarrse(scanner, clases, plazasTotales, plazasOcupadas);
                case 3 -> darsedebaja(scanner, clases, plazasOcupadas);
                case 4 -> estadisticas(clases, plazasOcupadas, plazasTotales);
                case 5 -> System.out.println("Gracias por utilizar el programa");
                default -> System.out.println("La opción escogida debe ser un número del 1 al 5");
            }
        }while (opcion !=5);
        scanner.close();
    }
    // Metodo para buscar una clase
    static int buscarClase(String[] clases, String nombre) {
        for (int i = 0; i < clases.length; i++) {
            if (clases[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    static void verclases(String[] clases, int[] plazasTotales, int[] plazasOcupadas) {
        for (int i = 0; i < clases.length; i++) {
            if (plazasOcupadas[i] == plazasTotales[i]) {
                System.out.println(clases[i] + ": " + plazasOcupadas[i] + "/" + plazasTotales[i] + " plazas (COMPLETA)");
            } else {
                System.out.println(clases[i] + ": " + plazasOcupadas[i] + "/" + plazasTotales[i] + " plazas");
            }
        }
    }
    static void apuntarrse(Scanner scanner, String[] clases, int[] plazasTotales, int[] plazasOcupadas) {
            System.out.print("Introduce el nombre de la clase: ");
            String nombre = scanner.nextLine();
            int posicion = buscarClase(clases, nombre);
            if (posicion == -1) {
                System.out.println("La clase no existe.");
                return;
            }
            System.out.print("¿Cuántas plazas quieres reservar? ");
            int cantidad;
            try {
                cantidad = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número válido.");
                return;
            }
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");
                return;
            }
            if (plazasOcupadas[posicion] + cantidad <= plazasTotales[posicion]) {
                plazasOcupadas[posicion] += cantidad;
                System.out.println("Reserva realizada correctamente.");
            } else {
                System.out.println("No hay suficientes plazas disponibles.");
            }
        }

    static void darsedebaja(Scanner scanner, String[] clases, int[] plazasOcupadas) {
            System.out.print("Introduce el nombre de la clase: ");
            String nombre = scanner.nextLine();
            int posicion = buscarClase(clases, nombre);
            if (posicion == -1) {
                System.out.println("La clase no existe.");
                return;
            }
            System.out.print("¿Cuántas plazas quieres liberar? ");
            int cantidad;
            try {
                cantidad = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número válido.");
                return;
            }
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");
                return;
            }
            if (cantidad <= plazasOcupadas[posicion]) {
                plazasOcupadas[posicion] -= cantidad;
                System.out.println("Baja realizada correctamente.");
            } else {
                System.out.println("No puedes liberar más plazas de las ocupadas.");
            }
        }

    static void estadisticas(String[] clases, int[] plazasOcupadas, int[] plazasTotales) {
        int totalOcupadas = 0;
        int maxOcupadas = 0;
        int posicionMax = -1;
        for (int i = 0; i < clases.length; i++) {
            totalOcupadas += plazasOcupadas[i];
            if (plazasOcupadas[i] > maxOcupadas) {
                maxOcupadas = plazasOcupadas[i];
                posicionMax = i;
            }
        }
        System.out.println("Total de plazas ocupadas: " + totalOcupadas);
        if (posicionMax == -1) {
            System.out.println("Todavía no hay ninguna plaza ocupada.");
        } else {
            System.out.println("Clase con más alumnos: " + clases[posicionMax]);
            System.out.println("Plazas ocupadas: " + maxOcupadas);
        }
    }
}
    
