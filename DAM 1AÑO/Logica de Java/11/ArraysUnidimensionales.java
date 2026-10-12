public class ArraysUnidimensionales {
    public static void main(String[] args) {
        // 1. Array de 6 notas decimales, cada una distinta y con dos decimales
        double[] notas = {7.25, 8.50, 6.75, 9.10, 5.40, 8.95};

        // 2. Recorrido con for mostrando cada nota y su posición
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posición " + i + ": " + notas[i]);
        }

        // 3. Suma y media
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.printf("Suma: %.2f%n", suma);
        System.out.printf("Media: %.2f%n", media);

        // 4. Array de String con 4 compañeros, recorrido con for-each
        String[] companeros = {"Lucía", "Marcos", "Sara", "Pablo"};
        System.out.println("Compañeros:");
        for (String companero : companeros) {
            System.out.println("- " + companero);
        }
    }
}
