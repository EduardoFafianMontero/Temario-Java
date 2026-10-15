# DiagonalMatrices

## 📌 Sobre este ejercicio

Pide el tamaño de una matriz y sus valores, y calcula la **suma de la diagonal principal**: los elementos donde el número de fila es igual al de columna (`[0][0]`, `[1][1]`, `[2][2]`...).

## 🧩 Qué incluye

| Paso | Código | Qué hace |
| :--- | :--- | :--- |
| Tamaño | `Integer.parseInt(consola.nextLine())` (dos veces) | Lee renglones y columnas |
| Rellenar | dos `for` anidados | Pide cada valor de la matriz |
| Acumulador | `var sumaDiagonal = 0;` | Guarda el total, empieza en 0 |
| Recorrer | dos `for` anidados | Pasa por todos los elementos |
| Filtro | `if (ren == col) sumaDiagonal += matriz[ren][col];` | Solo suma los de la diagonal |

### 🔎 Ejemplo con una matriz 3x3

| | col 0 | col 1 | col 2 |
| :--- | :---: | :---: | :---: |
| **fila 0** | **1** | 2 | 3 |
| **fila 1** | 4 | **5** | 6 |
| **fila 2** | 7 | 8 | **9** |

Diagonal: `1 + 5 + 9 =` **15**.

## 💻 Compilar y ejecutar

```bash
javac DiagonalMatrices.java
java DiagonalMatrices
```

## 📝 Notas

⚠️ **Esto no compila tal cual está:** el archivo se llama `DiagonalMatrices.java`, pero la clase es `DiagonalMatriz`. Deben llamarse igual: renombra la clase a `DiagonalMatrices` o el archivo a `DiagonalMatriz.java`.

Con eso corregido, **funciona**.

- **Usa el patrón acumulador + `if` dentro de un doble `for`**, igual que en *Suma Acumulativa*, pero sobre una matriz.
- **Se puede hacer con un solo `for`:** como la diagonal solo tiene los elementos `[i][i]`:
  ```java
  for (var i = 0; i < Math.min(renglones, columnas); i++) {
      sumaDiagonal += matriz[i][i];
  }
  ```
  Recorre solo las posiciones que hacen falta, en vez de revisar todas.
- **La diagonal solo está bien definida en matrices cuadradas** (mismas filas que columnas). Con una matriz 2x3 se sumaría solo `[0][0]` y `[1][1]`.
- Si se escribe una letra, lanza `NumberFormatException`; si el tamaño es negativo, `NegativeArraySizeException`.
- **Reto:** calcula también la **diagonal secundaria** (la que va de arriba a la derecha a abajo a la izquierda). Se cumple `ren + col == columnas - 1`.