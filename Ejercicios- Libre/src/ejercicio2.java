import java.util.Scanner;
 
/*
 * Ejercicio 02: notas con arreglo y método
 *
 * Pide 5 notas, las guarda en un arreglo y muestra: las notas, la media
 * (con un método), la nota más alta y su posición, cuántas están por encima
 * de la media y las notas en orden inverso.
 */
public class ejercicio02{
    static final int NUM_NOTAS = 5;
    // Devuelve la media de las notas del arreglo
    static double calcularMedia(double[] v) {
        double suma = 0;
        for (double n : v) {
            suma += n;
        }
        return suma / v.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[NUM_NOTAS];
 
        // 1) Leer las notas. El do-while repite la pregunta mientras la nota no esté entre 0 y 10
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Nota " + (i + 1) + " (0-10): ");
                nota = Double.parseDouble(scanner.nextLine());
                if (nota < 0 || nota > 10) {
                    System.out.println("  Nota no válida: debe estar entre 0 y 10");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        // 2) Media con el método
        double media = calcularMedia(notas);
 
        // 3) Posición de la nota más alta y cuántas superan la media (una sola pasada)
        int posMax = 0;
        int superiores = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notas[posMax]) {
                posMax = i;
            }
            if (notas[i] > media) {
                superiores++;
            }
        }
        // Mostrar resultados
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " -> " + notas[i]);
        }
        System.out.printf("Media: %.2f%n", media);
        // posMax + 1: el usuario cuenta desde 1, el arreglo desde 0
        System.out.println("Nota más alta: " + notas[posMax] + " (nota número " + (posMax + 1) + ")");
        System.out.println("Notas por encima de la media: " + superiores);
 
        // 5) Orden inverso: del último índice al primero
        System.out.print("Al revés:");
        for (int i = notas.length - 1; i >= 0; i--) {
            System.out.print(" " + notas[i]);
        }
        System.out.println();
 
        scanner.close();
    }
}