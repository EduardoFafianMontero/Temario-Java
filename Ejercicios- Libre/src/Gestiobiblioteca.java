import java.util.Scanner;

public class Gestiobiblioteca {
    static final int NUM_LIBROS = 5;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] titulos ={"Futbolisismos","Geroimo","Mago de oz", "Harry Potte","Diaio de Greg"};
        int[] ejemplares ={20,30,10,3,4};
        int[] prestados = {8,13,3,1,2};
        int opcion = 0;
        do {
            System.out.println("""
                    1. Ver libros
                    2. Prestar libros.
                    3. Devolver libros.
                    4. Mostrar estadísticas.
                    5. Salir.
            """);
            try {
                opcion=Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("La opcion que introdujiste no es correcta");
                opcion = 0;
                continue;
            }
            switch (opcion){
                case 1 ->verLibros(titulos,ejemplares,prestados);
                case 2 -> prestarLibros(titulos,ejemplares,prestados,scanner);
                case 3 -> devolverLibro(titulos,prestados,ejemplares,scanner);
                case 4 -> mostrarEstadisticas (titulos,prestados,ejemplares);
                case 5 -> System.out.println("Gracias por utiliza el programa");
                default -> System.out.println("Vuelve a intoducir una opcion ente 1-5");
            }
        }while (opcion!=5);
        scanner.close();

    }


    static int buscarrlibro(String[] titulos,String nombre) {
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    static void verLibros(String[] titulos, int[] ejemplares, int[] prestados) {
        for (int i = 0; i < titulos.length; i++) {
            int disponibles = ejemplares[i] - prestados[i];
            if (disponibles == 0) {
                System.out.printf("%-15s Prestados: %d Disponibles: %d AGOTADO%n",
                        titulos[i], prestados[i], disponibles);
            } else {
                System.out.printf("%-15s Prestados: %d Disponibles: %d%n",
                        titulos[i], prestados[i], disponibles);
            }
        }
    }
    static void prestarLibros(String[] titulos, int[] ejemplares, int[] prestados, Scanner scanner) {
        System.out.println("Escribe el título del libro:");
        String nombre = scanner.nextLine().trim();
        int indice = buscarrlibro(titulos, nombre);
        if (indice == -1) {
            System.out.println("El libro no existe");
            return;
        }
        int disponibles = ejemplares[indice] - prestados[indice];
        if (disponibles == 0) {
            System.out.println("No quedan ejemplares disponibles");
            return;
        }
        prestados[indice]++;
        System.out.println("Préstamo realizado correctamente");
        System.out.println("Libro: " + titulos[indice]);
        System.out.println("Disponibles: " + (ejemplares[indice] - prestados[indice]));

    }
    static void devolverLibro(String[] titulos, int[] ejemplares, int[] prestados, Scanner scanner){
        System.out.println("Escribe el título del libro:");
        String nombre = scanner.nextLine().trim();
        int indice = buscarrlibro(titulos, nombre);
        if (indice == -1) {
            System.out.println("El libro no existe");
            return;
        }
        if (prestados[indice] == 0) {
            System.out.println("No hay libros pendientes de devolver");
            return;
        }
        prestados[indice]--;
        System.out.println("Devolución realizada correctamente");
        System.out.println("Libro: " + titulos[indice]);
        System.out.println("Préstamos actuales: " + prestados[indice]);
    }
    static void mostrarEstadisticas(String[] titulos, int[] ejemplares, int[] prestados){
        int totalEjemplares = 0;
        int totalPrestados = 0;
        int maxPrestados = -1;
        int indiceMaximo = -1;
        for (int i = 0; i < titulos.length; i++) {
            totalEjemplares += ejemplares[i];
            totalPrestados += prestados[i];
            if (prestados[i] > maxPrestados) {
                maxPrestados = prestados[i];
                indiceMaximo = i;
            }
        }
        int totalDisponibles = totalEjemplares - totalPrestados;
        System.out.println("ESTADÍSTICAS DE LA BIBLIOTECA");
        System.out.println("Total ejemplares: " + totalEjemplares);
        System.out.println("Total prestados: " + totalPrestados);
        System.out.println("Total disponibles: " + totalDisponibles);
        if (indiceMaximo != -1) {
            System.out.println("Libro con más préstamos: " +
                    titulos[indiceMaximo] + " (" + maxPrestados + ")");
        }
    }
}
