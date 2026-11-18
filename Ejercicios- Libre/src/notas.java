import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        final int NUM_ALUMNOS =5;
        final int NUM_ASIGNATURA= 3;
        String[] Alumnos ={"Ana","Carlos","lucia","Pedro","Marta"};
        String[] Asignatura ={"Progamacion","Base de datos","Sistemas"};
        double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURA];
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            for (int j = 0; j <NUM_ASIGNATURA ; j++) {
                notas[i][j]=-1;
            }

        }
        int opcion= 0;
        do {
            System.out.printf("""
                    1. Mostrar todas las notas
                    2. Introducir o modificar una nota
                    3. Consultar la media de un alumno
                    4.  Mostrar estadisticas generales
                    5. Salir
            """);
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Introduce el dato correcto");
            }
            switch (opcion){
                case 1 -> mostrarNotas(Alumnos,Asignatura);
                case 2 ->ponerNotas(Alumnos,Asignatura, notas,scanner);
                case 3 ->consultarMediaAlumno(Alumnos,Asignatura);
                case 4 ->mostrarEstadisticas(Alumnos,Asignatura);
                case 5 -> System.out.println("Gracias por tu visita");
                default -> System.out.println("intoduce un dato valido del 1-5");
            }
        }while (opcion !=5);
    }
    static int buscarAlumno(String[] alumnos, String nombre){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }
    static void mostrarNotas(String[] alumnos, String[] asignatura){
        for (int i = 0; i < ; i++) {

        }
    }
    static int ponerNotas(String[] alumnos, String[] asignatura, Scanner scanner){}
    static void consultarMediaAlumno(String[] alumnos, String[] asignatura){}
    static void mostrarEstadisticas(String[] alumnos, String[] asignatura){}

}
