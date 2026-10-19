/*
 * Actividad UD02-07: Operadores aritméticos, relacionales y lógicos
 *
 * Resultados calculados a mano ANTES de ejecutar:
 *   17 / 5                  -> 3      (división entera)
 *   17 % 5                  -> 2      (resto)
 *   17.0 / 5                -> 3.4    (división decimal)
 *   (10 > 5) && (3 < 1)     -> false  (true && false)
 *   (10 > 5) || (3 < 1)     -> true   (true || false)
 *   !(10 > 5)               -> false  (!true)
 */
public class ActividadUd0207 {
    public static void main(String[] args) {
        int division = 17 / 5;
        int resto = 17 % 5;
        double divisionDecimal = 17.0 / 5;
        boolean y = (10 > 5) && (3 < 1);
        boolean o = (10 > 5) || (3 < 1);
        boolean no = !(10 > 5);
 
        System.out.println("17 / 5               = " + division);
        System.out.println("17 % 5               = " + resto);
        System.out.println("17.0 / 5             = " + divisionDecimal);
        System.out.println("(10 > 5) && (3 < 1)  = " + y);
        System.out.println("(10 > 5) || (3 < 1)  = " + o);
        System.out.println("!(10 > 5)            = " + no);
    }
}
 