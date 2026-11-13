import java.util.Scanner;

public class PR13TresEnRaya {

    public static void mostrarTablero(char[][] tablero) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    public static char comprobarGanador(char[][] t) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] != ' ' && t[i][0] == t[i][1] && t[i][1] == t[i][2]) {
                return t[i][0];
            }
            if (t[0][i] != ' ' && t[0][i] == t[1][i] && t[1][i] == t[2][i]) {
                return t[0][i];
            }
        }
        if (t[1][1] != ' ' && t[0][0] == t[1][1] && t[1][1] == t[2][2]) {
            return t[1][1];
        }
        if (t[1][1] != ' ' && t[0][2] == t[1][1] && t[1][1] == t[2][0]) {
            return t[1][1];
        }
        return ' ';
    }

    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Pide un número entre 1 y 3; repite hasta que sea válido
    public static int pedirNumero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int n = Integer.parseInt(teclado.nextLine().trim());
                if (n >= 1 && n <= 3) {
                    return n - 1;
                }
                System.out.println("Error: el número debe estar entre 1 y 3.");
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        char jugador = 'X';
        char ganador = ' ';
        boolean empate = false;

        while (ganador == ' ' && !empate) {
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugador);

            int fila;
            int columna;
            while (true) {
                fila = pedirNumero(teclado, "Fila (1-3): ");
                columna = pedirNumero(teclado, "Columna (1-3): ");
                if (tablero[fila][columna] == ' ') {
                    break;
                }
                System.out.println("Error: la casilla está ocupada.");
            }

            tablero[fila][columna] = jugador;
            ganador = comprobarGanador(tablero);
            empate = tableroLleno(tablero);

            if (ganador == ' ' && !empate) {
                jugador = (jugador == 'X') ? 'O' : 'X';
            }
        }

        mostrarTablero(tablero);
        if (ganador != ' ') {
            System.out.println("¡Gana el jugador " + ganador + "!");
        } else {
            System.out.println("¡Empate!");
        }
        teclado.close();
    }
}
