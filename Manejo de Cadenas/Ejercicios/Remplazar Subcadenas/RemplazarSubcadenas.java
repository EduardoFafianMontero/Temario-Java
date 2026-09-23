public class RemplazarSubcadenas.java{
  public static main(String[] args){
    // Reemplazar subcadenas //
    var cadena="hola mundo";
    System.out.println("cadena = "+cadena);

    // Remplazar Munndo por a todos //
    var nuevaCadena= cadena.eplace("mundo", "a todos");
    System.out.println("nuevaCadena = "+cadena);

    //Remplazar la subcadena Hola por Adios //
    nuevaCadena = cadena.replace("Hola", "Saludos");
  }
}