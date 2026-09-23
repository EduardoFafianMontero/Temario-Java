public class RemplazarSubcadenas{
  public static void main(String[] args){
    // Reemplazar subcadenas //
    var cadena="hola mundo";
    System.out.println("cadena = "+cadena);

    // Remplazar Munndo por a todos //
    var nuevaCadena= cadena.replace("mundo", "a todos");
    System.out.println("nuevaCadena = "+nuevaCadena);

    //Remplazar la subcadena Hola por Adios //
    nuevaCadena = cadena.replace("hola", "Saludos");
    System.out.println("nuevaCadena= "+nuevaCadena);
  }
}