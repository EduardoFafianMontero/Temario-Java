import java.util.Scanner;

public class gimnasio {
    static final int NUM_ACTIVIDADES = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Actividades ={"Spinning","Yoga","Pilates","Crosfit","Natacion"};
        int[] Plazas ={20,15,12,18,25};
        int[] Reservas={12,10,12,8,20};
        int opcion = 0;
        do {
            System.out.println("""
                    1. Ver Actividades
                    2. Reservar plazas
                    3. Cancelar reservas
                    4. Mostrar Estadisticas
                    5. Salir
            """);
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("El numero introdcuido no es valido");
                opcion = 0;
                continue;
            }
            switch (opcion){
                case 1 ->verActividades(Actividades,Plazas,Reservas,scanner);
                case 2 -> reservarPlaza(Actividades,Plazas,Reservas,scanner);
                case 3 -> cancelarReserva(Actividades,Plazas,Reservas,scanner);
                case 4 -> mostrarEstadisticas(Actividades,Plazas,Reservas,scanner);
                case 5 -> System.out.println("Gracias por utilizar el programa");
                default -> System.out.println("el numero es incorrecto tiene que estar ente el 1-5");
            }
        }while (opcion != 5);
    }
    static int buscaactividades(String[] Activididades,String nombre){
        for (int i = 0; i < Activididades.length; i++) {
            if (Activididades[i].equalsIgnoreCase(nombre))
            return i;
        }
        return -1;
    }
    static void verActividades(String[] actividades, int[] plazas, int[] reservas, Scanner scanner){
        for (int i = 0; i < actividades.length; i++) {
            int disponibles= plazas[i]-reservas[i];
            System.out.println("Actividades " + actividades[i] + "Plazas Totales" + plazas[i] + "Reservas" + reservas[i] + "Disponibles"  + disponibles);
            if (disponibles == 0){
                System.out.println("Completo");
            }
        }
    }
    static  void reservarPlaza(String[] actividades, int[] plazas, int[] reservas, Scanner scanner){
        System.out.println("Que actividad quieres resevar");
        String nombre = scanner.nextLine();
        int Actividad = buscaactividades(actividades,nombre);
        if (Actividad == -1){
            System.out.println("Esta Actividad no existe");
        }
        System.out.println("cuanntas plazas quiees reservar");
        int cantidad;
        try {
            cantidad = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Debes introducir una cantidad validad");
            return;
        }
        if (cantidad <= 0){
            System.out.println("La catidad debe se mayor que 0");
            return;
        }
        reservas[Actividad] += cantidad;
        System.out.println("Reseva Realizada");
    }

    static void cancelarReserva(String[] actividades, int[] plazas, int[] reservas, Scanner scanner) {
        System.out.println("¿Qué actividad quieres cancelar?");
        String nombre = scanner.nextLine();
        int actividad = buscaactividades(actividades, nombre);
        if (actividad == -1) {
            System.out.println("Esta actividad no existe");
            return;
        }
        if (reservas[actividad] == 0) {
            System.out.println("No hay reservas para cancelar");
            return;
        }
        System.out.println("¿Cuántas reservas quieres cancelar?");
        int cantidad;
        try {
            cantidad = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Cantidad no válida");
            return;
        }
        if (cantidad <= 0 || cantidad > reservas[actividad]) {
            System.out.println("Cantidad no válida");
            return;
        }
        reservas[actividad] -= cantidad;
        System.out.println("Cancelación realizada correctamente");
    }

    static void mostrarEstadisticas(String[] actividades, int[] plazas, int[] reservas, Scanner scanner) {
        int totalPlazas = 0;
        int totalReservas = 0;
        int maxReservas = -1;
        int posicionMax = 0;
        for (int i = 0; i < actividades.length; i++) {
            totalPlazas += plazas[i];
            totalReservas += reservas[i];
            if (reservas[i] > maxReservas) {
                maxReservas = reservas[i];
                posicionMax = i;
            }
        }
        int disponibles = totalPlazas - totalReservas;
        System.out.println("Total de plazas: " + totalPlazas);
        System.out.println("Total de reservas: " + totalReservas);
        System.out.println("Plazas disponibles: " + disponibles);
        System.out.println("Actividad con más reservas: " + actividades[posicionMax]);
    }
}
