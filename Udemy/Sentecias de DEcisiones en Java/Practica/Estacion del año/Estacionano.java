public class Estacionano{
  public static void main(Sting[] args){
    System.out.print(*** Estacion del año ***);
    var consola = new Scanner(System.in);

    System.out.print("Ingrese el mes del año (1-12): ");
    var mes = Integgre.parseInt(consola.nextLine());
    var estacion="";
    if (mes == 1 || mes == 2 || mes == 12)
       estacion = "ivierno";
      else if (mes == 3 || mes == 4 || mes == 5)
       estacion = "primavera";
      else if (mes == 6 || mes == 7 || mes == 8)
       estacion = "verano";
      else if(mes == 9 ||  mes == 10 || mes == 11)
      estacion = "otoño";
      else 
      estacion = "mes invalido";
     // Mostramos la estación del año
    System.out.printf("La estacion del año es: %s", estacion);
  }
}