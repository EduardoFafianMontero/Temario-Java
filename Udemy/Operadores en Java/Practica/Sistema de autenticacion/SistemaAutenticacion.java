import java.util.Scanner;
public classs SistemaAutenticacion{
  public static void main(String[] args) {
    System.out.println("*** Sistema de Autenticacion ***");
  
   final var USUARIO_VALIDO= "admin";
   final var PASSWORD_VALIDO= "1234";

   var consola = new Scanner(System.in);

   System.out.print("Ingrese el usuario: ");
   var usuarioIngresado= consola.nextLine();

   System.out.print("Ingrese el password: ");
    var passwordIngresado= consola.nextLine();

    var sonDatoscorrectos = usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresado.equals(PASSWORD_VALIDO);
    system.out.println("Autenticacion correcta? " + sonDatoscorrectos);
}