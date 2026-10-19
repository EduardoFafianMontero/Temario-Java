/*
 * Actividad UD02-22: Sentencias break y continue
 */
public class ActividadUd0222 {
    public static void main(String[] args) {
        // 1) Del 1 al 20, parar en el primer divisible entre 7
        System.out.println("--- break ---");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                break;
            }
        }

        // 2) Del 1 al 20, mostrar solo los que NO son múltiplos de 3
        System.out.println("--- continue ---");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; // salta a la siguiente vuelta sin imprimir
            }
            System.out.println(i);
        }

        // 3) Buscar un nombre en un array
        System.out.println("--- búsqueda ---");
        String[] nombres = {"Ana", "Luis", "Marta", "Pablo", "Sofía"};
        String buscado = "Marta";
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(buscado)) {
                System.out.println("El nombre " + buscado + " aparece en la posición " + i);
                break;
            }
            System.out.println(nombres[i]);
        }
    }
}
