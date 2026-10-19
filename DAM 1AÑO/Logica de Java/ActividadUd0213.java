/*
 * Actividad UD02-13: Arrays bidimensionales (matrices)
 */
public class ActividadUd0213 {
    public static void main(String[] args) {
        // 1) Matriz de enteros de 5 filas x 5 columnas
        int[][] matriz = new int[5][5];

        // 2) Rellenar con fila x columna (empezando en 1)
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        // 3) Mostrar en formato tabla
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
}
