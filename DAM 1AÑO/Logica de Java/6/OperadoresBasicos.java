public class OperadoresBasicos {
    public static void main(String[] args) {
        // Resultados esperados calculados a mano:
        int division = 17 / 5;                 // 3     (división entera)
        int resto = 17 % 5;                    // 2     (resto)
        double divisionDecimal = 17.0 / 5;     // 3.4   (un operando es double)
        boolean and = (10 > 5) && (3 < 1);     // false (true && false)
        boolean or = (10 > 5) || (3 < 1);      // true  (true || false)
        boolean not = !(10 > 5);               // false (!true)

        System.out.println("17 / 5 = " + division);
        System.out.println("17 % 5 = " + resto);
        System.out.println("17.0 / 5 = " + divisionDecimal);
        System.out.println("(10 > 5) && (3 < 1) = " + and);
        System.out.println("(10 > 5) || (3 < 1) = " + or);
        System.out.println("!(10 > 5) = " + not);
        // Al ejecutar, la consola coincide con lo calculado a mano.
    }
}
