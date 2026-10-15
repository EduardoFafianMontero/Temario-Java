# Matrices (introducir datos)

## 📌 Sobre este ejercicio

Pide por consola **el número de filas (renglones) y de columnas**, crea una matriz de ese tamaño, pide **cada valor** con dos `for` anidados y al final **imprime** toda la matriz. Une lo visto con `Scanner` y los arreglos.

## 🧩 Qué incluye

| Paso | Código | Qué hace |
| :--- | :--- | :--- |
| Tamaño | `Integer.parseInt(consola.nextLine())` (dos veces) | Lee `renglones` y `columnas` |
| Crear | `new int[renglones][columnas]` | Matriz del tamaño elegido, en tiempo de ejecución |
| Rellenar | dos `for` + `matriz[ren][col] = Integer.parseInt(consola.nextLine());` | Pide cada valor, mostrando su posición |
| Mostrar | otros dos `for` + `println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col])` | Imprime todos los valores |

**Ejemplo de ejecución (2 filas x 2 columnas):**

```
Proporciona los renglones: 2
Proporciona las columnas: 2
Valor[0][0] = 10
Valor[0][1] = 20
Valor[1][0] = 30
Valor[1][1] = 40

Matriz[0][0] = 10
Matriz[0][1] = 20
Matriz[1][0] = 30
Matriz[1][1] = 40
```

## 💻 Compilar y ejecutar

```bash
javac Matrices.java
java Matrices
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:** el archivo se llama **`Matices.java`** (sin la **r**), pero la clase es **`Matrices`**. Una clase `public` debe llamarse igual que su archivo. Solución: renombra el archivo a `Matrices.java`.

Con el nombre corregido, el programa **funciona**.

- **Mismo patrón dos veces:** un par de `for` anidados para **llenar** la matriz y otro igual para **leerla**. Es el esquema de *Introducir valores a un arreglo*, pero con dos dimensiones.
- **`Integer.parseInt(consola.nextLine())`** evita el problema del salto de línea pendiente que da `nextInt()`.
- Si se escribe una letra, lanza `NumberFormatException`; si las filas o columnas son **negativas**, `NegativeArraySizeException`.
- El `System.out.println();` vacío antes del segundo recorrido solo deja una línea en blanco para separar.
- Los valores se piden **fila por fila**: primero `[0][0]`, `[0][1]`..., luego la fila siguiente.
- Convención: `int renglones, columnas;` se podría declarar y asignar en la misma línea al leerlos.
- La carpeta se llama `Introducir a Datos`; si la renombras, cambia también el enlace en el Readme del tema.