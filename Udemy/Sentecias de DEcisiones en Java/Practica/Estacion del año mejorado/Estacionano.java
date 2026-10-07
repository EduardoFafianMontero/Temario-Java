public class Estacionano{
  public static void main(Sting[] args){
    System.out.print(*** Estacion del año ***);
    var consola = new Scanner(System.in);

    System.out.print("Ingrese el mes del año (1-12): ");
    var mes = Integgre.parseInt(consola.nextLine());
    

    // Revision del mes usando switch mejorado 
    var estacion= switch (mes) {
      case 12, 1, 2 -> "Invierno";
      case 3, 4, 5 -> "Primavera";
      case 6, 7, 8 -> "Verano";
      case 9, 10, 11 -> "Otoño";
      default -> "Mes no válido";
    }
}