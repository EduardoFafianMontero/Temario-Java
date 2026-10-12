public class ArraysBidimensionales {
    public static void main(String[] args) {
        // 1. Matriz de enteros de 5 filas y 5 columnas
        int[][] matriz = new int[5][5];

        // 2. Rellenar con el producto fila × columna (empezando en 1)
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                matriz[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        // 3. Mostrar con formato de tabla
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
}
