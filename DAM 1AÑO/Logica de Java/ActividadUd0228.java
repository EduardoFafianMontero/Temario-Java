/*
 * Actividad UD02-28: Sobrecarga de métodos
 */
public class ActividadUd0228 {

    // 1) Cuadrado: un parámetro (lado)
    static double calcularArea(double lado) {
        return lado * lado;
    }

    // 1) Rectángulo: dos parámetros (base y altura)
    static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // 2) Rectángulo con descuento: tres parámetros. El descuento se indica en %
    static double calcularArea(double base, double altura, double descuento) {
        double area = base * altura;
        return area - (area * descuento / 100);
    }

    public static void main(String[] args) {
        // 3) Java elige la versión según el NÚMERO de argumentos
        System.out.println("Cuadrado de lado 4: " + calcularArea(4));
        System.out.println("Rectángulo 5 x 3: " + calcularArea(5, 3));
        System.out.println("Rectángulo 5 x 3 con 10% de descuento: " + calcularArea(5, 3, 10));
    }
}
