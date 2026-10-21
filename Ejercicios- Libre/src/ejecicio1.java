import java.util.Scanner;

public class ejecicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        double nota;
        double notaMaxima = 0;
        int aprobados = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Nota " + i + ": ");
            nota = Double.parseDouble(scanner.nextLine());

            suma += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }

            if (nota >= 5) {
                aprobados++;
            }
        }

        double media = suma / 5;

        System.out.printf("Media: %.2f%n", media);
        System.out.println("Nota más alta: " + notaMaxima);
        System.out.println("Notas aprobadas: " + aprobados);

        if (media >= 5) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Suspenso");
        }

        scanner.close();
    }
}