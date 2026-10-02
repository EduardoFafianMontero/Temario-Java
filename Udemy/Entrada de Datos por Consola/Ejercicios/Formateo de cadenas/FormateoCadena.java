public class FormateoCadena{
  public static void main( String[] args){
  System.out.println("*** Formateo de Cadenas ***");
  var nombre = "Eduardo";
  var edad = 35;
  var salario = 21000.50;

  // Para formatear utilizamos el  String.format //
  var mensaje = String.format("Nombre: %s", nombre);
  System.out.println(mensaje);

  // Para añadir mas opciones //
 mensaje = String.format("Nombre: %s, Edad:%d,Salario: %f", nombre,edad,salario);
  System.out.println(mensaje);

  // Metodo printf //
  System.out.printf("Nombre: %s, Edad:%d, Salario: %.2f%n", nombre,edad,salario);
 }
}