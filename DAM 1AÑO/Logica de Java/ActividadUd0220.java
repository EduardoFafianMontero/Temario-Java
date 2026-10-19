/*
 * Actividad UD02-20: Bucle for-each
 */
public class ActividadUd0220 {
    public static void main(String[] args) {
        // 1) Asignaturas con guion delante
        String[] asignaturas = {"Programación", "Bases de Datos", "Sistemas Informáticos",
                "Lenguajes de Marcas", "Entornos de Desarrollo"};
        for (String asignatura : asignaturas) {
            System.out.println("- " + asignatura);
        }

        // 2) Contar notas >= 5
        int[] notas = {4, 7, 5, 9, 3, 6, 8, 2};
        int aprobadas = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobadas++;
            }
        }
        System.out.println("Notas iguales o superiores a 5: " + aprobadas);
    }
}
