public class OperadoresAsignacionUnarios {
    public static void main(String[] args) {
        // 1. Operadores de asignación compuesta
        int total = 10;
        System.out.println("Valor inicial: " + total); // 10

        total += 5;
        System.out.println("Tras += 5: " + total);     // 15

        total -= 3;
        System.out.println("Tras -= 3: " + total);     // 12

        total *= 2;
        System.out.println("Tras *= 2: " + total);     // 24

        total /= 4;
        System.out.println("Tras /= 4: " + total);     // 6

        // 2. Operador ++ tres veces seguidas
        int contador = 0;
        contador++;
        System.out.println("Contador: " + contador);   // 1
        contador++;
        System.out.println("Contador: " + contador);   // 2
        contador++;
        System.out.println("Contador: " + contador);   // 3
    }
}
