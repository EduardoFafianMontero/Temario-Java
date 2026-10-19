import java.util.Arrays;

/*
 * Actividad UD02-27: Paso de parámetros
 */
public class ActividadUd0227 {

    // 1) Multiplica por 2, suma 10, resta 4 y muestra el resultado (sin devolver nada)
    static void operaciones(int numero) {
        numero = numero * 2;
        numero = numero + 10;
        numero = numero - 4;
        System.out.println("Dentro del método: " + numero);
    }

    // 3) Duplica todos los elementos del array recibido
    static void duplicarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2;
        }
    }

    public static void main(String[] args) {
        // 2) ¿Cambia la variable de main tras la llamada?
        int valor = 5;
        operaciones(valor);
        System.out.println("En main, valor sigue siendo: " + valor);
        // NO cambia. Los tipos primitivos se pasan POR VALOR: el método recibe una
        // COPIA de la variable, así que modificarla dentro no afecta al original.

        // 4) Con arrays sí cambia: se pasa la referencia al mismo array
        int[] datos = {1, 2, 3, 4};
        System.out.println("Antes : " + Arrays.toString(datos));
        duplicarArray(datos);
        System.out.println("Después: " + Arrays.toString(datos));
        // El método trabaja sobre el MISMO array de memoria (no una copia),
        // por eso los cambios se ven también en main.
    }
}
