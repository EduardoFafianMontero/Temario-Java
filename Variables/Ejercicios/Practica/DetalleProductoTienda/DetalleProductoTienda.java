public class DetalleProductoTienda{
  public static void main(String[] args){
    //Detalles del Producto//
     String NombreProducto="Camara";
     double PrecioProducto=800.99;
     int CantidadProducto=5;
     boolean Disponible=true;

     //Imprimir el producto//
     System.out.println("NombreProducto="+NombreProducto);
     System.out.println("PrecioProducto="+PrecioProducto);
     System.out.println("CantidadProducto="+CantidadProducto);
     System.out.println("Disponible="+ Disponible);

     //Modificar el producto//
     NombreProducto="Camara canon";
     PrecioProducto=500.90;
     CantidadProducto=0;
     Disponible=false;

     //Imprimir el producto//
     System.out.println();
     System.out.println("NombreProducto="+NombreProducto);
     System.out.println("PrecioProducto="+PrecioProducto);
     System.out.println("CantidadProducto="+CantidadProducto);
     System.out.println("Disponible="+ Disponible);
    }
}