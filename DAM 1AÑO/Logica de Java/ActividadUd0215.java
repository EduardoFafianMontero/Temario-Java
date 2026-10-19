import java.util.Scanner;

/*
 * Actividad UD02-15: Condicional switch
 */
public class ActividadUd0215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) y 2) Día de la semana con switch (con default)
        System.out.print("Número del día (1-7): ");
        int dia = Integer.parseInt(scanner.nextLine());
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número no válido: debe estar entre 1 y 7");
        }

        // 3) Estación del año según el mes (case agrupados, sin break entre ellos)
        System.out.print("Número del mes (1-12): ");
        int mes = Integer.parseInt(scanner.nextLine());
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes no válido: debe estar entre 1 y 12");
        }

        scanner.close();
    }
}
