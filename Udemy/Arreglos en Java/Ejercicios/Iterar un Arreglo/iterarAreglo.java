public class iterarArreglo{
  public static void main(String[] ags){
    // Arreglos
    //int[] enteros = {100,200,300,400,500};
    var enteros = new int[]{100,200,300,400,500};
    // Iterar los elementos de arreglo
    for(var i = 0; i < enteros.length; i++)
    System.out.println("Valor del indice: " + i + " = " + enteros[i]);
  }
}