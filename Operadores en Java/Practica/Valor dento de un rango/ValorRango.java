import java.util.Scanner;
public class ValorRango{
  public static void main(String[] args){
    System.out.println("*** Valor Dentro Ranngo ***");

    //Definimos los limites
    final var minimo = 0;
    final var maximo = 5;

    //Solicitar un valor entre 0 y 5 
    System.out.println("Prroporciona un dato dento de 0 y 5: ");
    var dato = Integer.parseInt(new Scanner(System.in).nextLine());

    // Verificar si el dao esta dento de rango //
    var estaDentroRango = dato >= minimo && dato <= maximo;
    System.out.println("estaDentroRango? " +estaDentroRango);
  }
}