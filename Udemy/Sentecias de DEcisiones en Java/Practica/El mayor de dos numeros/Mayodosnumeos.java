import java.util.Scanner;
public class Mayodosnumeos{
  public static void main(Sting[] args){
    System.out.print(*** El mayor de dos numeros ***);
    var consola = new Scanner(System.in);
    System.out.print("Ingrese el primer numero; ");
    var primerNumero = Integer.parseInt(consola.nextLine());
    System.out.print("Ingrese el segundo numero; ");
    var segundoNumero = Integer.parseInt(consola.nextLine());

    // Determinamos el mayor de los dos números
    if(primerNumero > segundoNumero)
      System.out.printf("El mayor de los dos numeros es: %d", primerNumero);
    else if(segundoNumero > primerNumero)
      System.out.printf("El mayor de los dos numeros es: %d", segundoNumero);
    else
      System.out.println("Los dos numeros son iguales");
  }
}