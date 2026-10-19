/*
 * Actividad UD02-06: Conversión de tipos
 */
public class ActividadUd0206 {
    public static void main(String[] args) {
        // 1) int -> double: NO hace falta conversión explícita (ensanchamiento,
        //    no se pierde información).
        int entero = 15;
        double decimal = entero;
        System.out.println("int " + entero + " -> double " + decimal);

        // 2) double -> int: SÍ hace falta casting explícito.
        //    Se obtiene 9: el casting TRUNCA (corta la parte decimal), no redondea.
        double valor = 9.75;
        int convertido = (int) valor;
        System.out.println("double " + valor + " -> int " + convertido);

        // 3) División de dos enteros
        int a = 7;
        int b = 2;
        int divisionEntera = a / b;               // int / int = división entera
        double divisionDecimal = (double) a / b;  // casting a uno de los operandos
        System.out.println(a + " / " + b + " (entera)  = " + divisionEntera);
        System.out.println(a + " / " + b + " (decimal) = " + divisionDecimal);
    }
}