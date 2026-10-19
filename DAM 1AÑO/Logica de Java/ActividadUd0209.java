/*
 * Actividad UD02-09: Salida básica por consola
 */
public class ActividadUd0209 {
    public static void main(String[] args) {
        // 1) Nombre y apellido en la misma línea (print no salta de línea)
        System.out.print("Eduardo ");
        System.out.print("Fafián");
        System.out.println(); // salto de línea para separar del siguiente bloque

        // 2) En líneas separadas (println sí salta de línea)
        System.out.println("Eduardo");
        System.out.println("Fafián");

        // 3) printf con varias variables y la nota media con 2 decimales
        String nombre = "Eduardo";
        int edad = 20;
        double notaMedia = 7.856;
        System.out.printf("Nombre: %s | Edad: %d | Nota media: %.2f%n", nombre, edad, notaMedia);
        // %s = texto, %d = entero, %.2f = decimal con 2 decimales, %n = salto de línea
    }
}
