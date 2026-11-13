public class PR07BoletinNotas {

    public static double mediaAlumno(double[][] notas, int fila) {
        double suma = 0;
        for (int j = 0; j < notas[fila].length; j++) {
            suma += notas[fila][j];
        }
        return suma / notas[fila].length;
    }

    public static void main(String[] args) {
        double[][] notas = {
                {6.5, 7.0, 5.5},
                {9.0, 8.5, 9.5},
                {4.0, 5.5, 3.5},
                {7.5, 6.0, 8.0}
        };

        double mejorMedia = -1;
        int mejorAlumno = -1;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%.2f  ", notas[i][j]);
            }
            double media = mediaAlumno(notas, i);
            System.out.printf("| Media: %.2f%n", media);

            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = i;
            }
        }

        System.out.printf("El alumno con la media más alta es el nº %d (posición %d) con %.2f%n",
                mejorAlumno + 1, mejorAlumno, mejorMedia);
    }
}
