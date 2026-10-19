/*
 * Actividad UD02-12: Arrays unidimensionales
 */
public class ActividadUd0212 {
    public static void main(String[] args) {
        // 1) Array de 6 notas con dos decimales, todas distintas y entre 0 y 10
        double[] notas = new double[6];
        notas[0] = 7.25;
        notas[1] = 5.50;
        notas[2] = 9.75;
        notas[3] = 4.80;
        notas[4] = 8.10;
        notas[5] = 6.35;

        // 2) Recorrer con for mostrando posición y nota
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Posición %d: %.2f%n", i, notas[i]);
        }

        // 3) Suma y media
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.printf("Suma: %.2f%n", suma);
        System.out.printf("Media: %.2f%n", media);

        // 4) Array de String inicializado con {...} y recorrido con for-each
        String[] companeros = {"Lucía", "Marcos", "Paula", "Daniel"};
        for (String companero : companeros) {
            System.out.println(companero);
        }
    }
}
