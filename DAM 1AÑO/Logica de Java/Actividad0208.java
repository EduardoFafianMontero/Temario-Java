/*
 * Actividad UD02-08: Operadores de asignación y unarios
 */
public class ActividadUd0208 {
    public static void main(String[] args) {
        // 1) Operadores de asignación compuesta
        int total = 10;
        System.out.println("total inicial = " + total);
        total += 5;   // 10 + 5
        System.out.println("total += 5 -> " + total);
        total -= 3;   // 15 - 3
        System.out.println("total -= 3 -> " + total);
        total *= 2;   // 12 * 2
        System.out.println("total *= 2 -> " + total);
        total /= 4;   // 24 / 4
        System.out.println("total /= 4 -> " + total);
 
        // 2) Operador ++
        int contador = 0;
        contador++;
        System.out.println("contador = " + contador);
        contador++;
        System.out.println("contador = " + contador);
        contador++;
        System.out.println("contador = " + contador);
    }
}