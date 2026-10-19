/*
 * Actividad UD02-03: Tipos de datos primitivos. Identificadores y declaración de variables.
 *
 * 1) Nombres de variable:
 *    edad            -> VÁLIDO y camelCase (una sola palabra en minúscula)
 *    2suma           -> NO VÁLIDO: no puede empezar por un número
 *    NotaFinal       -> VÁLIDO, pero NO camelCase (es PascalCase: empieza en mayúscula)
 *    nombre_alumno   -> VÁLIDO, pero NO camelCase (es snake_case)
 *    class           -> NO VÁLIDO: es una palabra reservada de Java
 *    numeroDeAlumnos -> VÁLIDO y camelCase
 *
 * 2) Tipo primitivo para cada dato:
 *    edad de una persona               -> int
 *    precio de un producto             -> double
 *    inicial de un nombre              -> char
 *    si aceptó los términos de uso     -> boolean
 *    población de un país              -> long (puede superar 2.147 millones)
 */
public class ActividadUd0203 {
    public static void main(String[] args) {
        // 3) Una variable de cada tipo
        int edad = 20;
        double precio = 19.99;
        char inicial = 'E';
        boolean aceptaTerminos = true;
        long poblacion = 48_000_000L;
 
        System.out.println("Edad (int): " + edad);
        System.out.println("Precio (double): " + precio);
        System.out.println("Inicial (char): " + inicial);
        System.out.println("Acepta términos (boolean): " + aceptaTerminos);
        System.out.println("Población (long): " + poblacion);
 
        // Diferencia int / long:
        //   int  -> 32 bits (4 bytes). Llega hasta 2.147.483.647
        //   long -> 64 bits (8 bytes). Llega hasta 9.223.372.036.854.775.807
        System.out.println("Máximo int : " + Integer.MAX_VALUE);
        System.out.println("Máximo long: " + Long.MAX_VALUE);
        int desbordado = Integer.MAX_VALUE + 1; // se pasa del límite y da la vuelta
        System.out.println("Máximo int + 1 = " + desbordado);
 
        // Diferencia float / double:
        //   float  -> 32 bits, unos 7 dígitos de precisión (literal con f)
        //   double -> 64 bits, unos 15-16 dígitos de precisión
        float piFloat = 3.14159265358979f;
        double piDouble = 3.14159265358979;
        System.out.println("float : " + piFloat);
        System.out.println("double: " + piDouble);
    }
}