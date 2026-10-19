/*
 * Actividad UD02-26: Procedimientos y funciones
 */
public class ActividadUd0226 {

    // 1) FUNCIÓN: devuelve un valor (boolean)
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // 2) PROCEDIMIENTO: no devuelve nada (void), solo hace algo (muestra un saludo)
    static void mostrarSaludo(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        System.out.println("4 es par? " + esPar(4));
        System.out.println("7 es par? " + esPar(7));
        System.out.println("10 es par? " + esPar(10));

        mostrarSaludo("Eduardo");
        mostrarSaludo("Lucía");
        mostrarSaludo("Marcos");

        // 3) esPar es una FUNCIÓN porque devuelve un resultado (return boolean)
        //    que se puede guardar o usar en una condición.
        //    mostrarSaludo es un PROCEDIMIENTO porque es void: no devuelve nada,
        //    solo realiza una acción (imprimir por pantalla).
    }
}
