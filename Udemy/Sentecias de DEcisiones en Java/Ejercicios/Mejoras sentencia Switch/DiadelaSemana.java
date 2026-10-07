public class DiadelaSemana {
    public static void main(String[] args) {
      System.out.print("*** Día de la semana ***");
      var dia = 1; // 1 es lunes, 2 martes, etc.
      switch (dia) {
        case 1 -> System.out.print("Lunes");
        case 2 -> System.out.print("Martes");
        case 3 -> System.out.print("Miércoles");
        case 4 -> System.out.print("Jueves");
        case 5 -> System.out.print("Viernes");
        case 6 -> System.out.print("Sábado");
        case 7 -> System.out.print("Domingo");
        default -> System.out.print("Día no válido");
      }
    }
}