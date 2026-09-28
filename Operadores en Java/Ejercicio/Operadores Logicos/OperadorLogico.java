public class OperadorLogico{
  public static void main(String[] args){
    System.out.println("*** Operador And, Or y Not ");
    var a = true;
    var b = false;
    // and regresa true si ambos valores son true //
    var resultadoAnd = a && b;
    System.out.println("And= " + resultadoAnd);

    //or (Regresa true si cualquiera de los valores es true) //
    var resultadoOR = a || b;
    System.out.println("OR= " + resultadoOR);

    // Not (Invierte el valor logico) //
    var resultadoNOT = !a;
        System.out.println("NOT= " + resultadoNOT);
  }
}