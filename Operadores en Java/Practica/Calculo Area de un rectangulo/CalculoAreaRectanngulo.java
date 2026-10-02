import java.util.scanner;
public class CalculoAreaRectanngulo{
  public static void main(String[] args) {
    System.out.println(*** Cálculo del Área de un Rectagulo ***);
    var consola= ew Scanner(System.in);
    System.out.print("Proporciona la base del rectangulo: ");
    var base= Integrer.parseInt(consola.nextLine());
    System.out.print("Proporciona la altura del rectangulo: ");
    var altura= Integer.parseInt(consola.nextLine());
     // Calculo del area del rectangulo //
    var area= base * altura;
    System.out.println("El area del rectangulo es: " + area);

    // Calculo del perimetro del rectangulo //
    var perimetroRectangulo= 2 * (base + altura) * 2;
    System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
  }
}