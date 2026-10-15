# Temario · Matrices en Java

## 🧱 ¿Qué es una matriz?

Un arreglo donde cada elemento es **otro arreglo**. Se usa para guardar datos en forma de tabla. Se accede con **dos índices**: `[fila][columna]`.

Ejemplo de `new int[2][3]` con valores:

| | **col 0** | **col 1** | **col 2** |
| :--- | :---: | :---: | :---: |
| **fila 0** | 100 | 200 | 300 |
| **fila 1** | 400 | 500 | 600 |

`matriz[1][2]` es `600`.

## 📝 Formas de crear una matriz

```java
int[][] a = new int[2][3];                 // 2 filas, 3 columnas, todo a 0
var b = new int[2][3];                     // igual, con var
int[][] c = {{1, 2, 3}, {4, 5, 6}};        // con valores (sintaxis simplificada)
var d = new int[][]{{1, 2, 3}, {4, 5, 6}}; // con var hay que usar new int[][]{...}
```

## 📏 Tamaños

| Expresión | Qué da |
| :--- | :--- |
| `matriz.length` | Número de **filas** |
| `matriz[0].length` | Número de **columnas** de la fila 0 |

## 🔁 Recorrer una matriz (dos `for` anidados)

```java
for (var fila = 0; fila < matriz.length; fila++) {
    for (var columna = 0; columna < matriz[fila].length; columna++) {
        System.out.print(matriz[fila][columna] + " ");
    }
    System.out.println();   // salto de línea al terminar cada fila
}
```

El `for` de fuera recorre las filas; el de dentro, las columnas de cada fila.

## ⚠️ Errores típicos

- **Confundir el orden:** es `[fila][columna]`, no al revés.
- **`ArrayIndexOutOfBoundsException`:** en una matriz 2x3, el máximo es `matriz[1][2]`; `matriz[2][0]` o `matriz[0][3]` fallan.
- **Imprimir la matriz directamente:** `System.out.println(matriz)` da una dirección tipo `[[I@1b6d3586`. Para verla: `Arrays.deepToString(matriz)` (con `import java.util.Arrays;`) o recorrerla con dos `for`.
- **Empezar a contar en 1:** la primera fila y la primera columna son la `0`.
- Las filas pueden tener **distinta longitud** (matrices irregulares), por eso se usa `matriz[fila].length` en el `for` interior.