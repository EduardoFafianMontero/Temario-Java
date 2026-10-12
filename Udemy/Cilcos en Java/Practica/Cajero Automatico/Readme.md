# CajeroAutomatico

## 📌 Sobre este ejercicio

Simula un cajero automático en consola: un menú que se repite con un `while` hasta que el usuario elige **Salir**, y un `switch` que ejecuta la operación elegida (consultar, retirar, depositar). Combina `Scanner`, `while`, `switch`, `if/else` y `printf`.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Saldo inicial | `var saldo = 1000.0;` | Dinero disponible (`double`) |
| Bandera | `var salir = false;` | Controla el ciclo: al pasar a `true`, termina |
| Ciclo | `while (!salir)` | Repite el menú mientras `salir` sea `false` |
| Menú | *text block* con `\s` final | Muestra las opciones; `\s` conserva el espacio tras `opcion:` |
| Opción | `consola.nextInt()` | Lee el número elegido |
| `case 1` | `printf("... %.2f%n%n", saldo)` | Consultar saldo |
| `case 2` | `if (retiro <= saldo) { saldo -= retiro; } else {...}` | Retirar solo si hay saldo suficiente |
| `case 3` | `saldo += deposito;` | Depositar |
| `case 4` | `salir = true;` | Salir: el `while` deja de repetirse |
| `default` | mensaje de opción inválida | Cualquier otro número |

## 💻 Compilar y ejecutar

```bash
javac CajeroAutomatico.java
java CajeroAutomatico
```

## 📝 Notas

⚠️ **Revisa el final del archivo:** en la captura veo **3 llaves de cierre** al final (switch, while y `main`) y hacen falta **4**, la última para cerrar la clase `CajeroAutomatico`. Si falta, da `reached end of file while parsing`.

⚠️ **Decimales con coma:** con Java configurado en español, `nextDouble()` espera la **coma** (`50,5`). Si escribes `50.5` lanza `InputMismatchException`.

⚠️ **Sin validar:** si retiras o depositas un monto **negativo**, el saldo se modifica al revés (retirar `-100` suma 100). Falta comprobar `monto > 0`. Y si escribes una letra en vez de un número, el programa se cae.

- Errata en el texto del menú: `Esocoge` → `Escoge`, y `Seleciona` → `Selecciona`.
- `%n%n` en `printf` es salto de línea doble, independiente del sistema operativo.
- El patrón **bandera + `while` + `switch`** es el mismo que en *Menu iterativo*.