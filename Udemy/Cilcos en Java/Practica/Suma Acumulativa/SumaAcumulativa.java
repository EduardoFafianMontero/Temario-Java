public class SumaAcumulativa{
  public static void main(String[] args){
    System.out.prinln("*** Sumas acumulativas ***");

    final var Maximo = 5;
    var acumuladorSuma= 0;

    // Iterar los valores //
    var numero = 1;
    while(numero <= Maximo){
      // Imprimir lo que se va a sumar 
      System.out.prinln("(acumuladorSuma +numero) ->" + acumuladorSuma+ "+ "+numero);

      //Realizar la suma acumulaiva
      acumuladorSuma += numero++; //acumuladorSuma = acumuladorSuma + numero //

      // Imprimir la suma parcial acumulada
      System.out.prinln("Suma parcial acumulada" + acumuladorSuma+ "\n ");
    }
    System.out.prinln("Suma de los pimeros cincos numeros"+Maximo+ " numeros " + acumuladorSuma);
  }
}