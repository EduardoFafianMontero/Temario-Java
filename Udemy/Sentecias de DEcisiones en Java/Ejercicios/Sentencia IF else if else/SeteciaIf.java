public class SeteciaIf{
  public static void mai (Strig[] args){
    // Uso de la setencia If //
    var edad = 16;
    if(edad >= 18){
      System.out.println("Eres mayor de edad");
    }
    else if (edad >= 13 && edad < 18){
      System.out.println("Eres un adolescente");
    }
    else{
      System.out.println("Eres un niño");
    }
  }
}