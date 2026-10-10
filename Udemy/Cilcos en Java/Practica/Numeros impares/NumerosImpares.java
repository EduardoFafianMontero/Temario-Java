public class NumerosImpares{
  public static void main(String[] args){
    System.out.prinltln("*** Numeros Impares ***");
    var contador = 0;
    do{
      // Revisamos si el numero es impar //
      if (contador %2 != 0){
        System.out.println(contador++);
      }
    }while(contador <= 20);
  }
}