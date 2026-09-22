public class ComparaciónCadenas{
  public static void main(String[] args){
    //Compaacio de Cadenas//
    var cadena1= "Java";
    var cadena2="Java";
    var cadena3= new String("Java");

    //Comparacion de cadenas (==) compaan la referencia//
    System.out.print("cadena1 es igual en referencia a cadena2: ");
    System.out.println(cadena1 == cadena2);

    //Comparamos cadena1 con cadena3 (Referencias)//
    System.out.print("cadena1 es igual en referencia a cadena3: ");
    System.out.println(cadena1 == cadena3);

    //Comparar cotenido usaremos el metodo equals//
     System.out.print("cadena1 es igual en cotenido a cadena3: ");
     System.out.println(cadena1.equals(cadena3));
  }
}