public class SalidaConsola {
    public static void main(String[] args) {
        // 1. Nombre y apellido en la misma línea con dos print() seguidos
        System.out.print("Edufafi ");
        System.out.print("Apellido");
        System.out.println(); // salto de línea para separar del siguiente bloque

        // 2. Nombre y apellido en líneas separadas con println
        System.out.println("Edufafi");
        System.out.println("Apellido");

        // 3. printf con nombre, edad y nota media (dos decimales)
        String nombre = "Edufafi";
        int edad = 20;
        double notaMedia = 8.5;
        System.out.printf("Nombre: %s | Edad: %d | Nota media: %.2f%n", nombre, edad, notaMedia);
    }
}
