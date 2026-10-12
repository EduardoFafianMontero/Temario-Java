public class ConversionTipos {
    public static void main(String[] args) {
        // 1. int -> double: conversión implícita, NO necesita casting
        int entero = 15;
        double decimal = entero;
        System.out.println("int " + entero + " asignado a double: " + decimal); // 15.0

        // 2. double -> int: conversión explícita (casting), se pierde la parte decimal
        double pi = 9.75;
        int truncado = (int) pi;
        System.out.println("double " + pi + " convertido a int: " + truncado); // 9
        // Da 9 porque el casting a int TRUNCA (corta los decimales), no redondea.

        // 3. División de dos enteros
        int a = 7;
        int b = 2;
        int divisionEntera = a / b;              // 3   (división entera)
        double divisionDecimal = (double) a / b; // 3.5 (casting de un operando a double)
        System.out.println(a + " / " + b + " (entera) = " + divisionEntera);
        System.out.println(a + " / " + b + " (decimal) = " + divisionDecimal);
    }
}
