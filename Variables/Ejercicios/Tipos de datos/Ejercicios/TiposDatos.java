public class TiposDatos{
  public static void main(String[] args){
    //Tipos de datos//
    //Enteros//
    byte tipoByte=127;
    System.out.println("tipoByte="+tipoByte);
    short tiposhort=32000;
    System.out.println("tiposhot="+tiposhort);
    int tipoInt=2147483647;
    System.out.println("tipoInt="+tipoInt);
    Long tipoLong=9223372036854775807L;
    System.out.println("tipoLong="+tipoLong);

    //Punto Flotante//
    float tipoFloat=3.14F;
    System.out.println("tipoFloat="+tipoFloat);
    double tipoDouble=3.1315D;
    System.out.println("tipoDouble="+tipoDouble);

    //Caracter//
    char tipoChar='A';
    System.out.println("tipoChar="+tipoChar);
    tipoChar=65;
    System.out.println("tipoChar="+tipoChar);

    //Boolean//
    boolean tipoBoolean=true;
    System.out.println("tipoBoolean="+tipoBoolean);
    tipoBoolean=false;
    System.out.println("ipoBoolean="+tipoBoolean);

    //Tipos de refencia//
    String nombre=null;
    System.out.println("nombre="+nombre);
    nombre="Eduado";
    System.out.println("nombe="+nombre);
  }
}