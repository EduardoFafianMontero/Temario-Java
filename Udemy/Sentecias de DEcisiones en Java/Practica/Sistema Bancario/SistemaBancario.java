import java.util.Scanner;
public class SistemaBancario{
  public static void main(String[] args){
    System.out.println(" *** Sistema Bancario *** ");
    var consola = new Scanner(System.in);

    System.out.print("Deseas salir del sisema (true/false)? ");
    var salirSisema = Boolean.parseBoolean(consola.nextLine());

    // Veificamos (aplicando ua logíca inversa) //
    if(!salirSistema){
      System.out.ptintln("Coninuamos en el sistema bancario...");
    }
    else{
      System.out.println("Saliendo del sistema bancario...");
    }
  }
}