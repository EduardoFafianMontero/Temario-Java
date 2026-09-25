import java.util.Scanner;
public class SistemaEmpleados{
  public static void main(String[] args){
   System.out.println(" *** Sistema de EMpleados *** ");
   var consola = new Scanner (System.in);
   // Nombe del empleado //
   System.out.print("Nombe del empleado: ");
   var nombreEmpleado = consola.nextLine();

   // Edad del empleado //
   System.out.print("Edad del empleado");
   var edadEmpleado = Integer.parseInt(consola.nextLine());

   //Salario Empleado //
   System.out.print("Salaio del empleado: ");
   var salarioEmpleado = Double.parseDouble(consola.nextLine());

   // Es jefe de departamento //
   System.out.print("Es jefe de departamento (true/false)?:");
   var esJefeDEpartamento = Boolean.parseBoolean(consola.nextLine());

   // Imprimier los valores Empleados // 
    System.out.println("\nDatos del Empleado: ");
    System.out.println("\tNombe del Empleado:" + nombreEmpleado);
    System.out.println("\tedad del Empleado:" + edadEmpleado );
    //System.out.println("\tSalario del Empleado:" + salarioEmpleado);
    System.out.printf("\tSalario del Empleado: $%.2fn", salarioEmpleado);
    System.out.println("\tEs Jefe de Departamento?:" + esJefeDEpartamento);
  }
}