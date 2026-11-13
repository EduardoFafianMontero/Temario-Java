import java.util.Scanner;

public class PR08CajeroAutomatico {

    // Decisión de diseño: los métodos ingresar y retirar DEVUELVEN el nuevo saldo
    // en lugar de modificar una variable global, así cada método es independiente,
    // fácil de probar y main sigue siendo quien controla el estado del saldo.

    public static void consultarSaldo(double saldo) {
        System.out.printf("Saldo actual: %.2f €%n", saldo);
    }

    public static double ingresar(double saldo, Scanner teclado) {
        System.out.print("Cantidad a ingresar: ");
        try {
            double cantidad = Double.parseDouble(teclado.nextLine().trim().replace(',', '.'));
            if (cantidad <= 0) {
                System.out.println("Error: la cantidad debe ser positiva.");
                return saldo;
            }
            saldo += cantidad;
            System.out.println("Ingreso realizado.");
        } catch (NumberFormatException e) {
            System.out.println("Error: cantidad no válida.");
        }
        return saldo;
    }

    public static double retirar(double saldo, Scanner teclado) {
        System.out.print("Cantidad a retirar: ");
        try {
            double cantidad = Double.parseDouble(teclado.nextLine().trim().replace(',', '.'));
            if (cantidad <= 0) {
                System.out.println("Error: la cantidad debe ser positiva.");
            } else if (cantidad > saldo) {
                System.out.println("Error: saldo insuficiente.");
            } else {
                saldo -= cantidad;
                System.out.println("Retirada realizada.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: cantidad no válida.");
        }
        return saldo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 1000.00;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n1) Consultar saldo");
            System.out.println("2) Ingresar dinero");
            System.out.println("3) Retirar dinero");
            System.out.println("4) Salir");
            System.out.print("Opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número del 1 al 4.");
                continue;
            }

            switch (opcion) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    saldo = ingresar(saldo, teclado);
                    break;
                case 3:
                    saldo = retirar(saldo, teclado);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        teclado.close();
    }
}
