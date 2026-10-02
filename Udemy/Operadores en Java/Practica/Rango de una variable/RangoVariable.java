import java.util.Scanner;
public class RangoVariable{
  public static void main(String[] arg){
   System.out.println("*** Rango de una variable *** ");
   var consola = new Scanner(System.in);
   System.out.println("Proporciona un dato enetero: ");
   var dato = Integer.parseInt(consola.nextLine());

   // Revisamos si está dentro de rango (ente 1 y 10) //
   var estaDentroRango = dato >= 1 && dato <= 10;
   System.out.println("Variable dentro de rango (1 y 10)? " +estaDentroRango);

   // Revisar l logica inversa,si el dato está fuera de rango // 
   var estafueraRango =!(dato >= 1 && dato <= 10);
   System.out.println("Variable fuera de rango (1 y 10)? " +estafueraRango);
  }
}
