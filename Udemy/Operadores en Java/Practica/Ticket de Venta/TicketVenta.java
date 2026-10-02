import java.util.Scanner;
public class TicketVenta{
  public static void main(String[] args) {
   System.out.println("*** Generacion Ticket de Venta ***");
   var consola = new Scanner(System.in);
   System.out.print("Precio del producto leche:" );
   var precioLeche= Double.parseDouble(consola.nextLine());
   System.out.print("Precio del producto pan:" );
   var precioPan= Double.parseDouble (consola.nextLine());
   System.out.print("Precio del producto lechuga:" );
   var precioLechuga= Double.parseDouble(consola.nextLine());
   // claculo de impuestos 16% //
   var impuestos= subtotal * 0.16;
   // Calculo total con impuestos //
   var total= subtotal + impuestos;

   // Impresion de ticket de venta //
   System.out.printf("""
                     subtotal: %.2f
                     impuestos (16%%): $%.2f
                     total: $%.2f
                    """, subtotal,impuestos, total);

  }
}