public class sistemareserva{
  public static void main(String[] args){
    //añadimos la información que nos piden//
    var nombrecliente=" Eduardo";
    var apellidoscliente="Fafián Montero";
    var distancia="7";
    var tarifadiaria="50";
    var vistas="false";

    //Imprimimos los datos//
    System.out.println("nombrecliente="+nombrecliente);
    System.out.println("apellidoscliente"+apellidoscliente);
    System.out.println("nombre cliente + apellidoscliente="+nombrecliente +apellidoscliente);
    System.out.println("distancia=" +distancia);
    System.out.println("tarifadiaria="+tarifadiaria);
    System.out.println("vistas="+vistas);

    //Modificamos algunos valores//
     distancia="4";
     tarifadiaria="90";
     vistas= "true";

    //Detalle de Reserva// 
    System.out.println();
    System.out.println("Nuevos datos de la reserva");
    System.out.println("nombrecliente="+nombrecliente);
    System.out.println("apellidoscliente"+apellidoscliente);
    System.out.println("nombre cliente + apellidoscliente="+nombrecliente +apellidoscliente);
    System.out.println("distancia=" +distancia);
    System.out.println("tarifadiaria="+tarifadiaria);
    System.out.println("vistas="+vistas);
  }
}