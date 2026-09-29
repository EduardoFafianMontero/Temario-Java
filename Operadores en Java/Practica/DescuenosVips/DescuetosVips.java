import java.util.Scanner;
public class DescuetosVips{
  public static void main(String[] args){
    System.out.println(" *** Sistema de descuentos Vips *** ");
    final var NO_PRODUCTOS_DESCUENTOS=10;
    var consola = new Scanner(System.in);

    System.out.print("Cuános productos compraste hoy? ");
    var cantidadProductos= Integer.parseInt(consola.nextLine());

    System.out.print("Tienes la membresía de la tienda(tue/False)?");
    var tienesmemebresia = Boolean.parseBoolean(consola.nextLine());
    var esElegibleDescuento=
          cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesmemebresia;
    System.out.println("Tienes acceso al descueto VIP? " + esElegibleDescuento);
  }
}