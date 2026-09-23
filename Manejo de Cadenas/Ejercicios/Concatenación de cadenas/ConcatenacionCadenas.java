public class ConcatenacionCadenas{
  public static void main(String[] args){
    //Mas formas de concatenar cadenas en Java //
    var cadena1= "hola";
    var cadena2= "mundo";
    var cadena3= cadena1 + " " + cadena2;
    System.out.println("cadena3 usando + =" + cadena3);

    // Metodo contac //
    cadena3 = cadena1.concat(" ").concat("mundo");
    System.out.println("cadena3 usando contac  =" + cadena3);

    // StingBuilder = Constuctor de Cadenas //
    var constructorCadenas = new StringBuilder();
    constructorCadenas.append(cadena1);
    constructorCadenas.append(" ");
    constructorCadenas.append(cadena2);
    var resultado = constructorCadenas.toString();
    System.out.println("resultado =" + resultado);

    // StringBuffer //
    var stringBuffer= new StringBuffer();
    stringBuffer.append(cadena1).append(" ").append(cadena2);
    System.out.println("resultado stringBuffer =" + resultado);

    // join //
    resultado= String.join(" ",cadena1,cadena2,"Adiós");
    System.out.println("resultado Join=" + resultado);
  } 
}