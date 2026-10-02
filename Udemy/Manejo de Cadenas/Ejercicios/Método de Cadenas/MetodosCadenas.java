public class MetodosCadenas{
  public static void main(String[] args){
  //Metodo de Cadenas//
  var cadena1= "Bienvenidos a mi esquema";

  // Obtener el largo de una cadena //
  var longitud= cadena1.length();
  System.out.println("Longitud= "+ longitud);

  // Remplazar Caracteres //
  var nuevaCadena= cadena1.replace('o', 'a');
  System.out.println("nuevaCadena= " + nuevaCadena);

  // Converti a mayussculas //
  var mayusculas= cadena1.toUpperCase();
  System.out.println("mayusculas= "+ mayusculas);
  // Convertir a minusculas //
  System.out.println("minusculas = " + cadena1.toLowerCase());

  // Eliminar espacios al inicio y al final //
  var  cadena2= " Leo Reyes    ";
  System.out.println ("cadena2 con espacios" + cadena2);
  System.out.println("cadena2 sin espacios" + cadena2.trim());
  }
}