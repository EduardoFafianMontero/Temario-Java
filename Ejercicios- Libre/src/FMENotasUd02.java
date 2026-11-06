
import java.util.Scanner; // Importamos Scanner para leer datos introducidos por teclado.

public class FMENotasUd02 { // Declaramos la clase principal del programa.

    // ==========================================
    // APARTADO A. DATOS Y CONSTANTES
    // ==========================================

    // Constantes que indican el número total de alumnos y asignaturas.
    static final int NUM_ALUMNOS = 4;
    static final int NUM_ASIGNATURAS = 3;

    // Array unidimensional que almacena los nombres de los alumnos.
    static String[] alumnos = {
            "Carlos", "María", "Pedro", "Lucía"
    };

    // Array unidimensional que almacena los nombres de las asignaturas.
    static String[] asignaturas = {
            "Programación", "Bases de Datos", "Sistemas"
    };

    // Matriz bidimensional donde guardaremos las notas de cada alumno.
    // Las filas representan alumnos y las columnas representan asignaturas.
    static double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

    // Bloque static: se ejecuta una sola vez al cargar la clase.
    static {
        // Recorremos todas las filas de la matriz.
        for (int i = 0; i < NUM_ALUMNOS; i++) {

            // Recorremos todas las columnas de cada fila.
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {

                // Inicializamos cada posición con -1.
                // El valor -1 significa que todavía no hay una nota.
                notas[i][j] = -1;
            }
        }
    }

    // Método que comprueba si una nota está dentro del rango permitido.
    public static boolean notaValida(double nota) {

        // Devuelve true si la nota es mayor o igual que 0 y menor o igual que 10.
        // Si no cumple ambas condiciones, devuelve false.
        return nota >= 0 && nota <= 10;
    }


    // ==========================================
    // APARTADO B. MENÚ PRINCIPAL
    // ==========================================

    public static void main(String[] args) {

        // Creamos Scanner para leer lo que escribe el usuario.
        Scanner scanner = new Scanner(System.in);

        // Variable que almacena la opción seleccionada en el menú.
        int opcion = 0;

        // do-while: ejecuta el menú al menos una vez.
        // Se repetirá mientras la opción sea diferente de 6.
        do {

            // Mostramos el menú principal.
            System.out.println("""
                    
                    ========== GESTIÓN DE NOTAS ==========
                    1. Ver notas
                    2. Poner una nota
                    3. Media del alumno
                    4. Media de una asignatura
                    5. Mejor alumno
                    6. Salir
                    =====================================
                    """);

            // Intentamos convertir el texto introducido en un número entero.
            try {

                System.out.print("Selecciona una opción: ");

                // nextLine() lee el texto y parseInt() lo convierte en int.
                opcion = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                // Si el usuario introduce letras u otro formato incorrecto,
                // se ejecuta este bloque.
                System.out.println("La opción introducida no es correcta.");

                // Reiniciamos la opción para evitar que se salga del bucle.
                opcion = 0;

                // continue hace que vuelva directamente al principio del do-while.
                continue;
            }

            // Comprobamos que la opción esté entre 1 y 6.
            if (opcion < 1 || opcion > 6) {

                // Mensaje cuando el usuario introduce un número fuera del rango.
                System.out.println("La opción debe ser un número del 1 al 6.");

                // Volvemos a mostrar el menú.
                continue;
            }

            // switch permite ejecutar diferentes instrucciones según la opción.
            switch (opcion) {

                // Opción 1: muestra la tabla de notas.
                case 1 -> verNotas(notas, alumnos, asignaturas);

                // Opción 2: permite introducir o modificar una nota.
                case 2 -> ponerNota(notas, alumnos, asignaturas, scanner);

                // Opción 3: calcula y muestra la media de un alumno.
                case 3 -> mostrarMediaAlumno(notas, alumnos, scanner);

                // Opción 4: calcula y muestra la media de una asignatura.
                case 4 -> mostrarMediaAsignatura(notas, asignaturas, scanner);

                // Opción 5: busca al alumno con la mejor media.
                case 5 -> mejorAlumno(notas, alumnos);

                // Opción 6: muestra el mensaje de despedida.
                case 6 -> System.out.println("Gracias por utilizar este programa.");
            }

        } while (opcion != 6); // Repetimos el menú mientras no se seleccione salir.

        // Cerramos Scanner cuando terminamos de utilizarlo.
        scanner.close();
    }


    // ==========================================
    // APARTADO C. VER NOTAS
    // ==========================================

    // Método void: no devuelve ningún valor.
    // Recibe la matriz de notas y los arrays de nombres.
    static void verNotas(
            double[][] notas,
            String[] alumnos,
            String[] asignaturas) {

        // Mostramos el título de la tabla.
        System.out.println("\n========== NOTAS DE LOS ALUMNOS ==========");

        // Imprimimos la primera columna de la tabla.
        // %-15s reserva 15 espacios y alinea el texto a la izquierda.
        System.out.printf("%-15s", "Alumno");

        // Recorremos las asignaturas para crear la cabecera.
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {

            // Imprimimos el nombre de cada asignatura.
            System.out.printf("%-20s", asignaturas[j]);
        }

        // Saltamos a la siguiente línea después de la cabecera.
        System.out.println();

        // Primer bucle: recorremos todos los alumnos (filas).
        for (int i = 0; i < NUM_ALUMNOS; i++) {

            // Mostramos el nombre del alumno correspondiente a la fila.
            System.out.printf("%-15s", alumnos[i]);

            // Segundo bucle: recorremos todas las asignaturas (columnas).
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {

                // Comprobamos si la posición de la matriz contiene -1.
                if (notas[i][j] == -1) {

                    // Si no hay nota, mostramos dos guiones.
                    System.out.printf("%-20s", "--");

                } else {

                    // Si existe una nota, mostramos el valor con dos decimales.
                    System.out.printf("%-20.2f", notas[i][j]);
                }
            }

            // Saltamos de línea para empezar con el siguiente alumno.
            System.out.println();
        }
    }


    // ==========================================
    // APARTADO D. PONER UNA NOTA
    // ==========================================

    // Método que permite introducir una nota para un alumno y una asignatura.
    static void ponerNota(
            double[][] notas,
            String[] alumnos,
            String[] asignaturas,
            Scanner scanner) {

        // Variable para guardar el número del alumno seleccionado.
        int numeroAlumno;

        // Variable para guardar el número de la asignatura seleccionada.
        int numeroAsignatura;

        // Variable para guardar la nota que introduce el usuario.
        double nuevaNota;

        // Mostramos el título de selección de alumno.
        System.out.println("\n--- SELECCIONAR ALUMNO ---");

        // Recorremos el array de alumnos.
        for (int i = 0; i < NUM_ALUMNOS; i++) {

            // Mostramos el número de selección y el nombre del alumno.
            // Sumamos 1 porque los arrays empiezan en el índice 0.
            System.out.println((i + 1) + ". " + alumnos[i]);
        }

        // Bucle infinito hasta que el usuario introduzca un alumno válido.
        while (true) {

            try {

                // Pedimos el número del alumno.
                System.out.print("Introduce el número del alumno: ");

                // Convertimos el texto introducido en un entero.
                numeroAlumno = Integer.parseInt(scanner.nextLine());

                // Comprobamos que el número esté entre 1 y NUM_ALUMNOS.
                if (numeroAlumno >= 1 && numeroAlumno <= NUM_ALUMNOS) {

                    // break termina el while cuando el dato es válido.
                    break;
                }

                // Si está fuera del rango, mostramos un mensaje.
                System.out.println("El alumno debe estar entre 1 y " + NUM_ALUMNOS + ".");

            } catch (NumberFormatException e) {

                // Controlamos si el usuario introduce letras.
                System.out.println("Debes introducir un número entero.");
            }
        }

        // Mostramos el título de selección de asignatura.
        System.out.println("\n--- SELECCIONAR ASIGNATURA ---");

        // Recorremos el array de asignaturas.
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {

            // Mostramos el número y el nombre de cada asignatura.
            System.out.println((j + 1) + ". " + asignaturas[j]);
        }

        // Bucle para validar el número de asignatura.
        while (true) {

            try {

                // Pedimos el número de asignatura.
                System.out.print("Introduce el número de la asignatura: ");

                // Convertimos el texto introducido en un entero.
                numeroAsignatura = Integer.parseInt(scanner.nextLine());

                // Comprobamos que esté dentro del rango permitido.
                if (numeroAsignatura >= 1 && numeroAsignatura <= NUM_ASIGNATURAS) {

                    // Si es válido, salimos del bucle.
                    break;
                }

                // Mensaje cuando la asignatura no está dentro del rango.
                System.out.println("La asignatura debe estar entre 1 y " + NUM_ASIGNATURAS + ".");

            } catch (NumberFormatException e) {

                // Controlamos las entradas que no sean números enteros.
                System.out.println("Debes introducir un número entero.");
            }
        }

        // Bucle para validar la nota introducida.
        while (true) {

            try {

                // Pedimos la nota al usuario.
                System.out.print("Introduce la nota (0-10): ");

                // Convertimos el texto en double.
                // replace permite introducir tanto 8.5 como 8,5.
                nuevaNota = Double.parseDouble(scanner.nextLine().replace(',', '.'));

                // Utilizamos el método notaValida() del apartado A.
                if (notaValida(nuevaNota)) {

                    // Si la nota es válida, salimos del bucle.
                    break;
                }

                // Si la nota está fuera del rango, mostramos un mensaje.
                System.out.println("La nota debe estar entre 0 y 10.");

            } catch (NumberFormatException e) {

                // Controlamos si el usuario introduce un texto no numérico.
                System.out.println("Debes introducir una nota numérica.");
            }
        }

        // Convertimos el número de alumno en un índice de matriz.
        // Ejemplo: alumno 1 corresponde al índice 0.
        int fila = numeroAlumno - 1;

        // Convertimos el número de asignatura en un índice de matriz.
        // Ejemplo: asignatura 1 corresponde al índice 0.
        int columna = numeroAsignatura - 1;

        // Comprobamos si ya existía una nota en esa posición.
        if (notas[fila][columna] != -1) {

            // Avisamos de que vamos a sustituir la nota anterior.
            System.out.println("Aviso: se va a sobrescribir la nota anterior: "
                    + notas[fila][columna]);
        }

        // Guardamos la nueva nota en la posición correspondiente.
        notas[fila][columna] = nuevaNota;

        // Confirmamos que la operación se ha realizado correctamente.
        System.out.println("Nota guardada correctamente.");
    }


    // ==========================================
    // APARTADO E. MEDIA DE UN ALUMNO
    // ==========================================

    // Recibe la matriz y el índice del alumno.
    // Devuelve un double con la media calculada.
    static double mediaAlumno(double[][] notas, int alumno) {

        // Acumula la suma de las notas del alumno.
        double suma = 0;

        // Cuenta cuántas notas válidas tiene el alumno.
        int contador = 0;

        // Recorremos todas las asignaturas del alumno seleccionado.
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {

            // Ignoramos las posiciones que contienen -1.
            if (notas[alumno][j] != -1) {

                // Sumamos la nota a la variable suma.
                suma += notas[alumno][j];

                // Incrementamos el contador de notas válidas.
                contador++;
            }
        }

        // Si no hay ninguna nota, no podemos calcular una media.
        if (contador == 0) {

            // Devolvemos -1 para indicar que no hay notas.
            return -1;
        }

        // Dividimos la suma entre el número de notas existentes.
        return suma / contador;
    }


    // ==========================================
    // APARTADO E. MEDIA DE UNA ASIGNATURA
    // ==========================================

    // Recibe la matriz y el índice de la asignatura.
    // Devuelve la media de esa asignatura entre todos los alumnos.
    static double mediaAsignatura(double[][] notas, int asignatura) {

        // Variable que acumula las notas de la asignatura.
        double suma = 0;

        // Variable que cuenta las notas válidas.
        int contador = 0;

        // Recorremos todos los alumnos.
        for (int i = 0; i < NUM_ALUMNOS; i++) {

            // Comprobamos si el alumno tiene nota en esa asignatura.
            if (notas[i][asignatura] != -1) {

                // Sumamos la nota correspondiente.
                suma += notas[i][asignatura];

                // Incrementamos el número de notas registradas.
                contador++;
            }
        }

        // Si no hay notas registradas, devolvemos -1.
        if (contador == 0) {
            return -1;
        }

        // Calculamos y devolvemos la media.
        return suma / contador;
    }


    // ==========================================
    // MOSTRAR MEDIA DE UN ALUMNO
    // ==========================================

    // Este método solicita un alumno y muestra su media.
    static void mostrarMediaAlumno(
            double[][] notas,
            String[] alumnos,
            Scanner scanner) {

        // Mostramos el título.
        System.out.println("\n--- MEDIA DEL ALUMNO ---");

        // Mostramos todos los alumnos disponibles.
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println((i + 1) + ". " + alumnos[i]);
        }

        try {

            // Pedimos al usuario que seleccione un alumno.
            System.out.print("Selecciona un alumno: ");

            // Convertimos la selección en índice.
            // Restamos 1 porque los arrays empiezan en 0.
            int alumno = Integer.parseInt(scanner.nextLine()) - 1;

            // Comprobamos que el índice sea válido.
            if (alumno < 0 || alumno >= NUM_ALUMNOS) {

                // Avisamos de que el alumno no existe.
                System.out.println("Alumno no válido.");

                // return finaliza este método.
                return;
            }

            // Llamamos al método que calcula la media del alumno.
            double media = mediaAlumno(notas, alumno);

            // Comprobamos si el método ha devuelto -1.
            if (media == -1) {

                // Indicamos que no hay notas disponibles.
                System.out.println("Este alumno todavía no tiene notas.");

            } else {

                // Mostramos el nombre del alumno y su media con dos decimales.
                System.out.printf("Media de %s: %.2f%n", alumnos[alumno], media);

                // Llamamos al método recursivo para sumar las notas.
                double suma = sumaRecursiva(notas[alumno], NUM_ASIGNATURAS);

                // Mostramos el resultado de la suma recursiva.
                System.out.printf("Suma de sus notas: %.2f%n", suma);
            }

        } catch (NumberFormatException e) {

            // Controlamos si el usuario introduce letras.
            System.out.println("Debes introducir un número entero.");
        }
    }


    // ==========================================
    // MOSTRAR MEDIA DE UNA ASIGNATURA
    // ==========================================

    // Este método solicita una asignatura y muestra su media.
    static void mostrarMediaAsignatura(
            double[][] notas,
            String[] asignaturas,
            Scanner scanner) {

        // Mostramos el título.
        System.out.println("\n--- MEDIA DE UNA ASIGNATURA ---");

        // Recorremos el array de asignaturas.
        for (int j = 0; j < NUM_ASIGNATURAS; j++) {

            // Mostramos el número y nombre de cada asignatura.
            System.out.println((j + 1) + ". " + asignaturas[j]);
        }

        try {

            // Solicitamos la asignatura que queremos consultar.
            System.out.print("Selecciona una asignatura: ");

            // Convertimos la selección en índice.
            int asignatura = Integer.parseInt(scanner.nextLine()) - 1;

            // Validamos que el índice exista.
            if (asignatura < 0 || asignatura >= NUM_ASIGNATURAS) {

                // Mostramos un mensaje de error.
                System.out.println("Asignatura no válida.");

                // Terminamos el método.
                return;
            }

            // Calculamos la media de la asignatura seleccionada.
            double media = mediaAsignatura(notas, asignatura);

            // Comprobamos si no hay notas registradas.
            if (media == -1) {

                System.out.println("Esta asignatura todavía no tiene notas.");

            } else {

                // Mostramos el nombre de la asignatura y su media.
                System.out.printf("Media de %s: %.2f%n",
                        asignaturas[asignatura], media);
            }

        } catch (NumberFormatException e) {

            // Controlamos las entradas que no sean números enteros.
            System.out.println("Debes introducir un número entero.");
        }
    }


    // ==========================================
    // APARTADO E. MEJOR ALUMNO
    // ==========================================

    // Método que busca qué alumno tiene la media más alta.
    static void mejorAlumno(double[][] notas, String[] alumnos) {

        // Almacenará la mejor media encontrada.
        // Empezamos en -1 porque ninguna media válida puede ser inferior a 0.
        double mejorMedia = -1;

        // Almacenará el índice del alumno con mejor media.
        // Empezamos en -1 para indicar que todavía no hay ningún ganador.
        int mejorIndice = -1;

        // Recorremos todos los alumnos.
        for (int i = 0; i < NUM_ALUMNOS; i++) {

            // Calculamos la media del alumno actual.
            double media = mediaAlumno(notas, i);

            // Comprobamos si su media supera a la mejor encontrada.
            if (media > mejorMedia) {

                // Actualizamos la mejor media.
                mejorMedia = media;

                // Guardamos el índice del alumno.
                mejorIndice = i;
            }
        }

        // Si el índice sigue siendo -1, no hay notas registradas.
        if (mejorIndice == -1) {

            System.out.println("Todavía no hay notas registradas.");

        } else {

            // Mostramos el alumno que tiene la mejor media.
            System.out.printf("Mejor alumno: %s (media: %.2f)%n",
                    alumnos[mejorIndice], mejorMedia);
        }
    }


    // ==========================================
    // APARTADO F. RECURSIVIDAD
    // ==========================================

    // Método que suma los primeros n elementos de un array.
    // No utiliza bucles: se llama a sí mismo.
    static double sumaRecursiva(double[] fila, int n) {

        // CASO BASE:
        // Si n llega a 0, ya no quedan elementos por sumar.
        if (n == 0) {

            // Devolvemos 0 para terminar las llamadas recursivas.
            return 0;
        }

        // Si el elemento es -1, significa que no hay nota.
        if (fila[n - 1] == -1) {

            // Ignoramos esa posición y continuamos con el elemento anterior.
            return sumaRecursiva(fila, n - 1);
        }

        // CASO RECURSIVO:
        // Sumamos el elemento actual y llamamos al método con n - 1.
        return fila[n - 1] + sumaRecursiva(fila, n - 1);
    }

}
