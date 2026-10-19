/*
 * Actividad UD02-21: Bucles anidados
 */
public class ActividadUd0221 {
    public static void main(String[] args) {
        // 1) Triángulo de asteriscos
        for (int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 2) Tablas de multiplicar del 1 al 5
        for (int tabla = 1; tabla <= 5; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }
            System.out.println();
        }
    }
}
