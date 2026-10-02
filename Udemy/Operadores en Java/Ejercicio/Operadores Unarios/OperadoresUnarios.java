public class OperadoresUnarios{
  public static void main(String[] args){
    System.out.println("*** Operadores Unarios ***");

    int a= 3, b = -2, resultado;
    var c= true;

    // Operador unario + //
    resultado = +a;
    System.out.println("Resultado +a = "+ resultado);

    //Operador unario - //
    resultado = -a;
    System.out.println("resultado -a=" + resultado);

    // Operadores unarios incremetos/Decremento // 

    // Pre-incremento
    a = 3;
    resultado= ++a; // primero se incrementa el valor
    System.out.println("Resultado ++a="+ resultado);
    System.out.println("a ya se incremento="+ a);

    // Post-incremento 
    a = 3;
    resultado= a++;// Primero se usa el valor y despues se incrementa//
    System.out.println("Resultado a++="+ resultado);
    System.out.println("A en este mometo se incrementa = " + a);

  // Pre-decremento //
  b = -2;
  resultado = --b; //primero se incrementa y despues se usa el valor
  System.out.println("resultado --b=" + resultado);
  System.out.println("b ya se decremento="+ b);

  // Post-decremento
  b= -2;
  resultado = b--;// Primero se usa el valor, y despues se incrementa //
  System.out.println("resultado b--="+ resultado);
  System.out.println("b en este momento se decrementa="+ b);
  }
}