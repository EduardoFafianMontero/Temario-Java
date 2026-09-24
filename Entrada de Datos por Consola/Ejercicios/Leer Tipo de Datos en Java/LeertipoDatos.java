import java.util.Scanner;
public class LeertipoDatos{
  public static void main(String[] arg){
    //Leer distinos tipos de datos y leer un tipo int  //
    var  consola= new Scanner(System.in);
    System.out.println("Ingresa tu edad: ");
    var edad = consola.nextInt();
    System.out.println("edad = "+ edad);  

    //Leer un tipo double //
        System.out.println("Ingresa tu altura: ");
       var altura = consola.nextInt();
       System.out.println("altura = "+ altura);  

         // Consumimos el caracte de salto de linea //
         consola.nextLine();

           // Leer un tipo Strinng //
           System.out.pintln ("Ingesa tu nombe: ");
           var nombre = consola.nextLine();
           System.out.println("nombre = "+ nombe); 
  }
}