public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz
        final var RENGLONES = 2;
        final var COLUMNAS = 3;
        var matriz = new int[RENGLONES][COLUMNAS];
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Recorrer una matriz
        // 1. Ciclo mas externo. Recorrer los renglones
        for(var ren = 0; ren < RENGLONES; ren++){
            // 2. Ciclo interno. Recorrer las columnas
            for(var col = 0; col < COLUMNAS; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }

    }
}
