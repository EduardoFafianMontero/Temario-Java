tividadud0204 · JAVA
/*
 * Actividad UD02-04: Ámbito de una variable
 */
public class ActividadUd0204 {
    public static void main(String[] args) {
        // 1) Declarada sin inicializar y asignada en otra línea
        int contador;
        contador = 0;
 
        // 2) Declarada e inicializada en la misma línea
        double precioUnidad = 2.5;
 
        System.out.println("contador = " + contador);
        System.out.println("precioUnidad = " + precioUnidad);
 
        // 3) Variable declarada dentro de un bloque if
        if (contador == 0) {
            int dentroDelIf = 100;
            System.out.println("Dentro del if: " + dentroDelIf);
        }
 
        // Si intento usarla fuera del bloque:
        //     System.out.println(dentroDelIf);
        // IntelliJ la marca en rojo con: "Cannot resolve symbol 'dentroDelIf'"
        // (javac: "error: cannot find symbol")
 
        // 4) Ámbito de una variable:
        //    Es la zona del código donde la variable existe y se puede usar.
        //    Empieza donde se declara y termina en la llave } del bloque donde
        //    está. Fuera de ese bloque, la variable ya no existe.
    }
}