import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {

        System.out.println("*** Cálculo del Área de un Rectángulo ***");

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = consola.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = consola.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        consola.close();
    }
}