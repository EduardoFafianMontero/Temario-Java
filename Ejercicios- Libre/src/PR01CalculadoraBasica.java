import java.util.Scanner;

public class PR01CalculadoraBasica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String operador = "";
        boolean datosValidos = false;

        // Se piden todos los datos hasta que sean correctos
        while (!datosValidos) {
            try {
                System.out.print("Primer número: ");
                a = Double.parseDouble(teclado.nextLine().trim().replace(',', '.'));

                System.out.print("Segundo número: ");
                b = Double.parseDouble(teclado.nextLine().trim().replace(',', '.'));

                System.out.print("Operador (+, -, * o /): ");
                operador = teclado.nextLine().trim();

                if (operador.equals("+") || operador.equals("-")
                        || operador.equals("*") || operador.equals("/")) {
                    datosValidos = true;
                } else {
                    System.out.println("Error: operador no válido. Vuelve a introducir los datos.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: operando no válido. Vuelve a introducir los datos.\n");
            }
        }

        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Operación incorrecta: no se puede dividir entre 0.");
                    return;
                }
                resultado = a / b;
                break;
        }

        System.out.printf("%.2f %s %.2f = %.2f%n", a, operador, b, resultado);
        teclado.close();
    }
}
