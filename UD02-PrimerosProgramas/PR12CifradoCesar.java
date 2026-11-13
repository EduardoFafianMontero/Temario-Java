import java.util.Scanner;

public class PR12CifradoCesar {

    public static String cifrar(String texto, int desplazamiento) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + desplazamiento) % 26 + base);
            }
            resultado += c;
        }
        return resultado;
    }

    public static String descifrar(String textoCifrado, int desplazamiento) {
        String resultado = "";
        for (int i = 0; i < textoCifrado.length(); i++) {
            char c = textoCifrado.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base - desplazamiento + 26) % 26 + base);
            }
            resultado += c;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Mensaje: ");
        String mensaje = teclado.nextLine();

        int desplazamiento;
        try {
            System.out.print("Desplazamiento (1-25): ");
            desplazamiento = Integer.parseInt(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: el desplazamiento debe ser un número entero.");
            return;
        }

        if (desplazamiento < 1 || desplazamiento > 25) {
            System.out.println("Error: el desplazamiento debe estar entre 1 y 25.");
            return;
        }

        String cifrado = cifrar(mensaje, desplazamiento);
        String descifrado = descifrar(cifrado, desplazamiento);

        System.out.println("Cifrado:    " + cifrado);
        System.out.println("Descifrado: " + descifrado);
        System.out.println(descifrado.equals(mensaje)
                ? "Comprobación correcta: coincide con el original."
                : "Error: no coincide con el original.");
        teclado.close();
    }
}
