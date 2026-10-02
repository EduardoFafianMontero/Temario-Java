public class Generadoremail{
  public static void main(String[] args){
   System.out.println("*** GGenedaor de Emails ***");

   // Datros de entada 
   var nombreCompleto= "Eduardo Fafian Motero";
   var nombreEmpresa= "Fenando Wirtz";
   var extensionDominio=".com";

   //Normalizacion de Datos //
   var nombrenormalizado= nombreCompleto.strip().replace(" ",".").toLowerCase();
   var empresanormalizada= nombreEmpresa.strip().replace(" ",".").toLowerCase();

   // COnstuccionn del Email //
   var dominioEmail= "@" + empresanormalizada + extensionDominio;
   var emailFinal= nombrenormalizado + dominioEmail;

   // Mostrar Resultados //
    System.out.println("Nombe usuario original= " +nombreCompleto);
   System.out.println("Nombre usuario Limpio= " + nombrenormalizado);
   System.out.println("Dominio geneado= " + dominioEmail);
   System.out.println("Email final=" + emailFinal);
  }
}