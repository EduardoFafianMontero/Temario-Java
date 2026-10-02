public class indicescadena{
  public static void main(String[] args){
    //Manejo de indices en una cadena //
    var cadena1 ="Hola mundo";

    //Recupera el pimer caracter//
    var primercaracter= cadena1.charAt(0); //Recuperar el carcter 'H'//
    System.out.println("primercaracter=" + primercaracter);

    //Recuperar el ultimo caracter //
    var ultimocaracter=cadena1.charAt(9);
    System.out.println("ultimocaracter=" + ultimocaracter);

    //Impimir la leta M,indice 5 //
    var letram= cadena1.charAt(5);
    System.out.println("letram=" + letram);
  }
}