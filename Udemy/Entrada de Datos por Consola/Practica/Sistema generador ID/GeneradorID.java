import java.util.Random;
import java.util.Scanner;
public class GeneradorID{
  public static void main(String[] args){
    System.out.println(" *** Generador de ID ***");
    var consola = new Scanner(System.in);
    var aleatorio= new Random();

    // Solicitamos el nombre de usuario //
    System.out.println("Cual es tu nombre?");
    var nombre= consola.nextLine();

    // Solicitamos el appelido //
    System.out.println("Cual es tu apellido?");
    var apellido = consola.nextLine();

    // solicitamos el año//
    System.out.println("Cual es tu año de nacimiento?");
    var anionacimiento = consola.nextLine();

    // Normalizar los valores //
    var nombre2 = nombre.trim().toUpperCase().substring(0,2);
    var apellido2 = apellido.trim().toUpperCase().substring(0,2);
    var anionacimiento2 = anionacimiento.trim().toUpperCase().substring(0,2);

    // Generar el valor aleatorio //
    var numeroAleatorio = aleatorio.nextInt(9999) +1;

    // formato de 4 digitos //
    var numeroAleatorioformato = String.format ("%04d", numeroAleatorio);

    // Generar el id único //
    var idUnico= nombre2 + apellido2+anionacimiento2+numeroAleatorioformato;

    //Imprimir el id unico ""
     System.out.printf("""
                      tu id único es: %s
                      """,idUnico);
    consola.close();
  }
}