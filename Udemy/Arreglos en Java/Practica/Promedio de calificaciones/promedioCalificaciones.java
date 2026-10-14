import java.util.Scanner;

public class promedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones deseas agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());
        // Creamos el arreglo
        var calificaciones = new int[totalCalificaciones];
        // Solicitar los valores de las calificaciones
        for(var i = 0; i < totalCalificaciones; i++){
            System.out.print("Calificaciones[" + i + "] = " );
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        // Obtener el promedio de las calificaciones
        var sumaCalificaciones = 0;
        for(var i=0; i < totalCalificaciones; i++){
            // sumaPromedios = sumaPromedios + calificaciones[i]
            sumaCalificaciones += calificaciones[i];
        }
        var promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("\nPromedio de las Calificaciones: " + promedio);
    }
}
