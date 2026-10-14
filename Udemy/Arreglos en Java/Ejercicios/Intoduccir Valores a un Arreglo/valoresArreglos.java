import java.util.Scanner;

public class valoresArreglos {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        for(var i=0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del Arreglo: ");
        for(var i=0; i < largoArreglo; i++)
            System.out.println("enteros[" + i + "] = " + enteros[i]);
    }
}
