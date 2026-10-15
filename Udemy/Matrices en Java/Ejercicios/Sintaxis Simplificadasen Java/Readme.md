# Matrices (sintaxis simplificada)

## 📌 Sobre este ejercicio

Crea la matriz **con sus valores ya escritos**, en vez de asignar cada posición una a una, y la recorre con dos `for` anidados usando `.length`. Es la forma habitual de trabajar con matrices.

## 🧩 Qué incluye

| Elemento | Código | Para qué sirve |
| :--- | :--- | :--- |
| Matriz con valores | `new int[][]{ {100, 200, 300}, {400, 500, 600} }` | Cada `{ }` interior es una fila |
| Ciclo externo | `for (var ren = 0; ren < matriz.length; ren++)` | `matriz.length` = número de filas |
| Ciclo interno | `for (var col = 0; col < matriz[ren].length; col++)` | `matriz[ren].length` = columnas de esa fila |
| Salida | `println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);` | Muestra posición y valor |

**Salida esperada** (igual que en *Recorrer una Matriz*):

```
Valor[0][0] = 100
Valor[0][1] = 200
Valor[0][2] = 300
Valor[1][0] = 400
Valor[1][1] = 500
Valor[1][2] = 600
```

## 💻 Compilar y ejecutar

```bash
javac Matrices.java
java Matrices
```

## 📝 Notas

✅ **Compila y funciona.**

- **Dos formas equivalentes de escribirla:**
  ```java
  int[][] matriz = {{100, 200, 300}, {400, 500, 600}};   // con el tipo
  var matriz = new int[][]{{100, 200, 300}, {400, 500, 600}}; // con var
  ```
  Con `var` es **obligatorio** el `new int[][]` delante; la forma corta `{...}` sola solo vale con el tipo explícito.
- **Mejor que las constantes del ejercicio anterior:** aquí no hay `RENGLONES` ni `COLUMNAS`, porque `.length` ya conoce el tamaño. Si añades otra fila o columna, el recorrido **se adapta solo**.
- **Atención al `.length` interior:** va sobre `matriz[ren]` (la fila actual), no sobre `matriz`. Cada fila podría tener una longitud distinta.
- La carpeta se llama `Sintaxis Simplificadasen Java` (falta un espacio, debería ser `Simplificada en Java`). Si la corriges, cambia también el enlace en el Readme del tema.