import java.util.Scanner;
public class CasaEspejo{
  public static void main(String[] args){
    System.out.println(" *** Casa de los Espejos *** ");
    var consola = new Scanner(System.in);
    System.out.print("Cual es tu edad? ");
    var edad = Integer.parseInt(consola.nextLine());
    System.out.print("Tienes miedo a la oscuridad (true/false)? ");
    var miedoOscuridad = Boolean.parseBoolean(consola.nextLine());
    if(!miedoOscuridad && edad >= 10){
      System.out.println("Puedes entrar a la casa de los espejos");
    }
    else{
      System.out.println("No puedes entrar a la casa de los espejos");
    }
  }
}