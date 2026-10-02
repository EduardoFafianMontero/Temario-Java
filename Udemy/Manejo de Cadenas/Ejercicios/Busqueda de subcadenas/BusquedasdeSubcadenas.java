public class BusquedasdeSubcadenas{
  public static void main(String[] args){
    // Buscar subcadeas //
    // idexOf = Devuelve el indice de la primea aparcionn de la cadena que estamos buscado //
    var cadena1= " Hola mundo";
    // subcadena a buscar hola //
    var indice1= cadena1.indexOf("Hola");
    System.out.println("idice1 ="+ indice1);

    //lastIndexOf = Deveulve el indice de la ultima aparacion de la subcadena //
    //Subcadena de Mundo
    var indice2 =cadena1.lastIndexOf("mundo");
    System.out.println("idice2 ="+ indice2);

    // subcadena no encotrada devuelve -1 //
        var indice3= cadena1.indexOf("java");
        System.out.println("idice3 ="+ indice3);

        var indice4 =cadena1.lastIndexOf("java");
        System.out.println("idice4 ="+ indice4);
  }
}