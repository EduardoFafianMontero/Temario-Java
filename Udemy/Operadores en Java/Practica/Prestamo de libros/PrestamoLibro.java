import java.util.Scanner;
public class PrestamoLibro{
  public  static void main(String[] args){
    System.out.println(" *** Sistema de pestamo de libros *** ");
    final var DISTANCIA_PERMITIDA_KM = 3;
    var consola = new Scanner(System.in);

    System.out.printl("Cuentas con credencial de estudiante (True/False)? ");
    var TienesCredencial = Boolean.parseBoolean(consola.nextLine());

    System.out.printl("A cuantos km vives de la biblioteca ? ");
    var distaciaBibliotecaKM = Integre.parseInt(consola.nextLie());

    var eselegibleprestamo = 
    TienesCredencial || distaciaBibliotecaKM < DISTANCIA_PERMITIDA_KM

    System.out.prinln("Eres elegible para pestamo de libros? ") + esElegiblePrestamo;
  }
}