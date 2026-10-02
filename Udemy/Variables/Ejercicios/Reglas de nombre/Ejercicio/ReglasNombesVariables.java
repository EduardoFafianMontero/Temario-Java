public class ReglasNombresVaiables{
  public static void main(String[] args){
    //Reglas de nombres de variables//
    String nombreCompleto="Eduardo Fafián Montero";
    System.out.println("nombreCompleto="+nombreCompleto);
    String Nombrecompleto="Eduardo Fafián Montero 2";
    System.out.println("NombreCompleto="+NombreCompleto);
    //Strig nombre-cliente="Eduardo" No se puede usar guion medio en el nombre de la variable//
    String nombre_cliente=Eduardo"; //Correcto,no aplica buenas practicas//
    String _apellido="Fafián"; //Correcto,no aplica buenas practicas//
    String $apellido="Fafián"; //Correcto,no aplica buenas practicas//
    int  totalPiezas=10;//Correcto aplica buenas practicas//
    boolean esCasado=true; //Correcto aplica buenas practicas//
  }
}