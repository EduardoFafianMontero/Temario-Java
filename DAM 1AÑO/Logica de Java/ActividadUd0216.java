import java.util.Scanner;

/*
 * Actividad UD02-16: Operador ternario
 */
public class ActividadUd0216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce otro número entero: ");
        int otro = Integer.parseInt(scanner.nextLine());

        // 1) Par o impar con ternario
        String tipo = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("[Ternario] " + numero + " es " + tipo);

        // 2) Mayor de dos con ternario
        int mayor = (numero > otro) ? numero : otro;
        System.out.println("[Ternario] El mayor es " + mayor);

        // 3) Los mismos programas con if-else
        String tipoIf;
        if (numero % 2 == 0) {
            tipoIf = "par";
        } else {
            tipoIf = "impar";
        }
        System.out.println("[if-else] " + numero + " es " + tipoIf);

        int mayorIf;
        if (numero > otro) {
            mayorIf = numero;
        } else {
            mayorIf = otro;
        }
        System.out.println("[if-else] El mayor es " + mayorIf);

        /*
         * Comparación:
         *  - El ternario es más corto (1 línea) y va bien cuando solo hay que
         *    elegir entre dos valores para asignar a una variable.
         *  - El if-else ocupa más líneas, pero es más claro cuando hay que
         *    ejecutar varias instrucciones o hay más de dos casos.
         *  - Los dos dan exactamente el mismo resultado.
         */
        scanner.close();
    }
}
