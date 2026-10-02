public class OperadoresComparacion{
  public static void main(String[] args){
   System.out.println("*** Operadores de Comparacion ***");
   int a = 3, b = 2;

   // Igualdad == //
   var resultado = a == b;
   System.out.println("resultado a == b:" + resultado);

   // Distinto != //
   resultado = a != b;
   System.out.println("esultado a != b : " + resultado);

   // Mayor que //
   resultado = a > b;
   System.out.println("resultado a > b : " + resultado);

   // Mayor que o igual que //
   resultado = a >= b;
   System.out.println("resultado a >= b: "+ resultado);

   // Menos que //
   resultado = a < b;
   System.out.println("resultado a < b: "+ resultado);

   // Menos o igual que //
   resultado = a <= b;
   System.out.println("resultado a <= b: "+ resultado);
  }
  }