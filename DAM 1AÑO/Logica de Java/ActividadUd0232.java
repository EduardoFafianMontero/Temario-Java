/*
 * Actividad UD02-32: Depuración de programas
 *
 * Código ORIGINAL con errores (comentado):
 *
 *   int[] notas = {6, 7, 8, 9};
 *   int suma = 0;
 *   for (int i = 0; i <= notas.length; i++) {   // ERROR 1
 *       suma += notas[i];
 *   }
 *   double media = suma / notas.length;          // ERROR 2
 *   System.out.println(media);
 *
 * ERROR 1 (en el for): la condición i <= notas.length hace una vuelta de más.
 *   notas.length = 4, así que los índices válidos son 0, 1, 2 y 3. En la vuelta
 *   con i = 4 la línea "suma += notas[i];" lanza
 *   ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4.
 *   Solución: usar i < notas.length.
 *
 * ERROR 2 (lógico, aparece al arreglar el primero): suma y notas.length son
 *   int, así que suma / notas.length es una DIVISIÓN ENTERA: 30 / 4 = 7 (no 7.5)
 *   y luego se guarda como 7.0. Solución: (double) suma / notas.length.
 *
 * Al depurar en IntelliJ con un punto de ruptura en "suma += notas[i];" se ve
 * en la ventana Variables cómo i llega a 4 y entonces salta la excepción.
 */
public class ActividadUd0232 {
    public static void main(String[] args) {
        int[] notas = {6, 7, 8, 9};
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {  // corregido: < en lugar de <=
            suma += notas[i];
        }
        double media = (double) suma / notas.length; // corregido: casting a double
        System.out.println(media); // 7.5
    }
}
