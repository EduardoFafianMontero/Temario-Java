import java.util.Scanner;

public class PR09ProcesadorTexto {

    public static int contarVocales(String texto) {
        int total = 0;
        String minusculas = texto.toLowerCase();
        for (int i = 0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                total++;
            }
        }
        return total;
    }

    // Se asume que el texto ya viene recortado con trim()
    public static int contarPalabras(String texto) {
        int espacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                espacios++;
            }
        }
        return espacios + 1;
    }

    public static String invertir(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    public static boolean esPalindromo(String texto) {
        String limpio = texto.replace(" ", "").toLowerCase();
        return limpio.equals(invertir(limpio));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = teclado.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("Error: la frase está vacía.");
            return;
        }

        System.out.println("Vocales: " + contarVocales(frase));
        System.out.println("Palabras: " + contarPalabras(frase));
        System.out.println("Invertido: " + invertir(frase));
        System.out.println("¿Es palíndromo? " + (esPalindromo(frase) ? "Sí" : "No"));
        teclado.close();
    }
}
