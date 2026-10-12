import java.util.Scanner;

public class Menuiterativo{
  public static void main(String[] args){
    var consola = new Scanner(System.in);
    var salir = false;
    //Comenzar con la ieracion del menu
    while(!salir){
      System.out.println("""
                         ***  Sistemas de Administracion de Cuentas ***
                         Menu:
                         1. Crear cuenta
                         2. Elimiar Cueta
                         3.Salir
                         Escoje una opcion; \s
                         """);
     var opcion = consola.nextInt();
     // Evaluar cada opcion
     switch (opcion){
      case 1 -> System.out.println("Creando tu cuenta ..... \n");
      case 2 -> System.out.println("Eliminando tu cuenta..... \n");
      case 3 ->{
        System.out.println(" Saliendo del sistema.Hasta pronto");
        salir = true;
      }
      default -> System.out.prinln ("Opcion invalida ...\n");
     }
    }
  }
}