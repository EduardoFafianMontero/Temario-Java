# Matrices (recorrer)

## 📌 Sobre este ejercicio

Recorre **toda** la matriz de 2x3 con **dos `for` anidados** y muestra cada elemento con su posición. El `for` de fuera recorre las filas (renglones) y el de dentro, las columnas de cada fila.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Constantes | `final var RENGLONES = 2;` `final var COLUMNAS = 3;` | Tamaño de la matriz, en un solo sitio |
| Matriz | `new int[RENGLONES][COLUMNAS]` | Crea la tabla de 2 filas x 3 columnas |
| Ciclo externo | `for (var ren = 0; ren < RENGLONES; ren++)` | Una vuelta por cada fila |
| Ciclo interno | `for (var col = 0; col < COLUMNAS; col++)` | Una vuelta por cada columna de esa fila |
| Salida | `println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);` | Muestra la posición y el valor |

**Salida esperada:**

```
Valor[0][0] = 100
Valor[0][1] = 200
Valor[0][2] = 300
Valor[1][0] = 400
Valor[1][1] = 500
Valor[1][2] = 600
```

### 🔎 Cómo se ejecutan los ciclos

| `ren` | `col` (0 → 2) | Elementos que imprime |
| :---: | :---: | :--- |
| 0 | 0, 1, 2 | 100, 200, 300 |
| 1 | 0, 1, 2 | 400, 500, 600 |

Por cada vuelta del ciclo de fuera, el ciclo de dentro da **todas** sus vueltas.

## 💻 Compilar y ejecutar

```bash
javac Matrices.java
java Matrices
```

## 📝 Notas

✅ **Compila y funciona.**

- **Buena práctica:** usar constantes en mayúsculas (`RENGLONES`, `COLUMNAS`) evita repetir el `2` y el `3` por todo el código.
- **Alternativa con `.length`:** `ren < matriz.length` y `col < matriz[ren].length`. Así el recorrido sigue valiendo aunque cambie el tamaño de la matriz.
- Los comentarios `1. Ciclo más externo` y `2. Ciclo interno` explican bien el orden; es el patrón de recorrer una tabla.
- Con `println` cada valor sale en su línea. Con `print(valor + " ")` y un `println()` al terminar cada fila, se vería como tabla.
- Si el ciclo interno usara `RENGLONES` en vez de `COLUMNAS`, daría `ArrayIndexOutOfBoundsException` (3 columnas, pero solo 2 repeticiones esperadas por fila).
- Este ejercicio y el anterior tienen la misma clase `Matrices`, pero están en carpetas distintas, así que no chocan.