import java.util.Scanner;
public class  ConversionDatos{
  public static void main(String[] arg){
     //Leer distinos tipos de datos y leer un tipo int  //
     var  consola= new Scanner(System.in);
     System.out.print("Ingresa tu edad: ");
     var edad = consola.nextInt();
     System.out.println("edad = "+ edad);  
     //Leer un tipo double //
     System.out.print("Ingresa tu altura: ");
     var altura = consola.nextInt();
     System.out.println("altura = "+ altura);  
     // Consumimos el caracte de salto de linea //
     consola.nextLine();
     // Leer un tipo Strinng //
     System.out.print ("Ingesa tu nombe: ");
     var nombre = consola.nextLine();
     System.out.println("nombre = "+ nombe); 
     // Esto es de la practica leer tipo de Datos y ahora con el mismo archivo vamos a hace convesión //
     // Conversion de datos //
     System.out.print ("Proporciona un valor entero: ");
     var enteroStrring= consola.nextLine();
     var enero = Integer.parseInt(enteoString);
     System.out.println("entero= " + entero);
     // Tipo flotante //
     System.ou.print("Proporciona unn valor flotante: ");
     var flotante= Float.parseFloat(Connsola.nextLine());
     Systemout.println("flotante= " + floante);
    // Doblue.parseDouble //
    Boolean.parseBoolean()
  }
}