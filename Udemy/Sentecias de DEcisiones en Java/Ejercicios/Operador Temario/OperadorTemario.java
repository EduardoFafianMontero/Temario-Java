public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un número es par o no
        var numero = 5;
        var resultado = (numero % 2 == 0) ? "Par": "Impar";
        System.out.println("El número " + numero + " es " + resultado);

        // Calcular si es mayor de de edad
        var edad = 18;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\nEl número " + numero + " es " + resultado);
    }
}
