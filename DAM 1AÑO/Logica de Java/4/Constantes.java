public class Constantes {
    public static void main(String[] args) {
        // 1 y 2. Constantes: final + nombre en MAYÚSCULAS
        final double IVA = 0.21;
        final double PRECIO_BASE = 100.0;

        // 3. Precio final = precio base + IVA
        double precioFinal = PRECIO_BASE + (PRECIO_BASE * IVA);

        System.out.println("Precio base: " + PRECIO_BASE + " €");
        System.out.println("IVA: " + (IVA * 100) + "%");
        System.out.println("Precio final: " + precioFinal + " €");

        // 4. Intentar modificar la constante:
        // IVA = 0.25;
        // Error: "Cannot assign a value to final variable 'IVA'"
        // (no se puede asignar un valor a una variable final)
    }
}
