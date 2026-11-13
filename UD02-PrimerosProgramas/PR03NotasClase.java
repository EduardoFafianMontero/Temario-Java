public class PR03NotasClase {

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static int contarAprobados(double[] notas) {
        int aprobados = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static void main(String[] args) {
        double[] notas = {3.5, 5.0, 6.8, 7.5, 9.2, 4.9};

        for (int i = 0; i < notas.length; i++) {
            String calificacion;
            if (notas[i] < 5) {
                calificacion = "Suspenso";
            } else if (notas[i] < 7) {
                calificacion = "Aprobado";
            } else if (notas[i] < 9) {
                calificacion = "Notable";
            } else {
                calificacion = "Sobresaliente";
            }
            System.out.printf("Alumno %d: %.2f -> %s%n", i + 1, notas[i], calificacion);
        }

        System.out.printf("Media de la clase: %.2f%n", calcularMedia(notas));
        System.out.println("Número de aprobados: " + contarAprobados(notas));
    }
}
