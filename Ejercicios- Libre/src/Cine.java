import java.util.Scanner;

public class Cine {
    static final int NUM_Peliculas = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] peliculas ={"Interstellar","Gladiator","Avatar","Titanic","Matrix"};
        int[] aforos ={100,80,120,90,75};
        int[] vendidas ={65,80,90,40,25};
        int opcion;
        do {
            System.out.println("""
                    1. Mostrar Peliculas
                    2. Comprar entradas
                    3. Devolver Entradas
                    4. Mostrar estadisticas
                    5. salir
            """);
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("El dato inntoducido es incorrecto");
                opcion = 0;
                continue;
            }
            switch (opcion){
                case 1 ->mostrarPeliculas(peliculas,aforos,vendidas);
                case 2 ->comprarEntradas(peliculas,aforos,vendidas,scanner);
                case 3->devolverEntradas(peliculas,aforos,vendidas,scanner);
                case 4 ->mostrarEstadisticas(peliculas,aforos,vendidas,scanner);
                case 5 -> System.out.println("Gracias por utilizar el progama");
                default -> System.out.println("El numero introducido no es valido tiene que ser entre 1-5");
            }
        }while (opcion != 5);
    }
    static int buscarPelicula(String[] peliculas,String nombre ){
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }
    static void mostrarPeliculas(String[] peliculas, int[] aforos, int[] vendidas){
        for (int i = 0; i < peliculas.length; i++) {
            int disponible = aforos[i] - vendidas[i];
            System.out.println("Peliculas: " + peliculas[i] + " aforos" + aforos[i] + "vendidas" + vendidas[i] + "disponibles" + disponible);
            if (disponible == 0){
                System.out.println("estan agottadas");
            }
        }
    }
    static void comprarEntradas(String[] peliculas, int[] aforos, int[] vendidas, Scanner scanner){
        System.out.println("Que pelicula quieres comprar");
        String nombre = scanner.nextLine();
        int buscar = buscarPelicula(peliculas,nombre);
        if (buscar == -1){
            System.out.println("esta pelicula no existte");
            return;
        }
        System.out.println("Cuantas entradas quieres comprar?");
        int cantidades;
        try {
            cantidades = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Debes introducir una cantidad exacta");
            return;
        }
        if (cantidades == 0){
            System.out.println("La cantidad debe ser mayor que 0");
        }
        vendidas[buscar] += cantidades;
        System.out.println("Compra realizada");
    }
    static void  devolverEntradas(String[] peliculas, int[] aforos, int[] vendidas, Scanner scanner){
        System.out.println("Que pelicula quieres comprar");
        String nombre = scanner.nextLine();
        int buscar = buscarPelicula(peliculas,nombre);
        if (buscar == -1){
            System.out.println("esta pelicula no existte");
        }
        System.out.println("Cuantas entradas quieres comprar?");
        int cantidades;
        try {
            cantidades = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Debes introducir una cantidad exacta");
            return;
        }
        if (cantidades == 0){
            System.out.println("La cantidad debe ser mayor que 0");
        }
        vendidas[buscar] -= cantidades;
        System.out.println("Entrada devuelta");
    }
    static void mostrarEstadisticas(String[] peliculas, int[] aforos, int[] vendidas, Scanner scanner){

    }
}
