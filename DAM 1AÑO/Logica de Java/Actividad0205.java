/*
 * Actividad UD02-05: Constantes
 */
public class ActividadUd0205 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double PRECIO_BASE = 100.0;
 
        double precioFinal = PRECIO_BASE + PRECIO_BASE * IVA;
        System.out.println("Precio base : " + PRECIO_BASE);
        System.out.println("IVA         : " + (IVA * 100) + " %");
        System.out.println("Precio final: " + precioFinal);
 
        // 4) Si intento modificar la constante:
        //     IVA = 0.10;
        // IntelliJ marca error: "Cannot assign a value to final variable 'IVA'"
        // (javac: "error: cannot assign a value to final variable IVA")
    }
}